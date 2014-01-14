/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_link")
public class Link implements Serializable, Comparable<Link>{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(nullable = false)
  private Integer amount;

  @Column(nullable = false)
  private String url;

  @ManyToOne
  @JoinColumn(name = "seller_id", nullable = false)
  private Seller seller;

  @ManyToOne
  @JoinColumn(name = "product_id", nullable = false)
  private Product product;
  
  public Link() {}
  
  public static Link create(String url, Integer amount, 
          Seller seller, Product product) {
    Link link = new Link();
    link.setUrl(url);
    link.setAmount(amount);
    link.setSeller(seller);
    link.setProduct(product);
    return link;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(id).append(",");
    sb.append("amount:").append(amount).append(",");
    sb.append("url:").append(url).append(",");
    sb.append("product:").append(product).append(",");
    sb.append("seller:").append(seller);
    sb.append("}");
    return sb.toString();
  }

  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return the amount
   */
  public Integer getAmount() {
    return amount;
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  /**
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * @param url the url to set
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * @return the seller
   */
  public Seller getSeller() {
    return seller;
  }

  /**
   * @param seller the seller to set
   */
  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  /**
   * @return the product
   */
  public Product getProduct() {
    return product;
  }

  /**
   * @param product the product to set
   */
  public void setProduct(Product product) {
    this.product = product;
  }

  @Override
  public int compareTo(Link link) {
    if (link != null) {
      return this.id - link.id;
    } else {
      return 1;
    }
  }

  @Override
  public boolean equals(Object obj) {
    Link link = (Link)obj;
    return link != null && link.id == this.id;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 59 * hash + Objects.hashCode(this.id);
    return hash;
  }
}
