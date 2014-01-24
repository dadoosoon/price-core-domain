/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author codekitten
 */
@Entity
@Table(name = "t_record")
public class Record implements Serializable {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
  @Column(nullable = true)
  private Double price;
  
  @Column(nullable = true)
  private Integer stock;
  
  @ManyToOne
  @JoinColumn(name = "link_id", nullable = false)
  private Link link;
  
  @Column(nullable = false)
  private Long datetime;
  
  public Record() {}
  
  public static Record create(Double price, Integer stock, 
          Link link, Long datetime) {
    Record record = new Record();
    record.price = price;
    record.stock = stock;
    record.link = link;
    record.datetime = datetime;
    return record;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(id).append(",");
    sb.append("price:").append(price).append(",");
    sb.append("stock:").append(stock).append(",");
    sb.append("link:").append(link).append(",");
    sb.append("datetime:").append(datetime).append(",");
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
   * @return the value
   */
  public Double getPrice() {
    return price;
  }

  /**
   * @param price the value to set
   */
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * @return the stock
   */
  public Integer getStock() {
    return stock;
  }

  /**
   * @param stock the stock to set
   */
  public void setStock(Integer stock) {
    this.stock = stock;
  }

  /**
   * @return the link
   */
  public Link getLink() {
    return link;
  }

  /**
   * @param link the link to set
   */
  public void setLink(Link link) {
    this.link = link;
  }

  /**
   * @return the datetime
   */
  public Long getDatetime() {
    return datetime;
  }

  /**
   * @param datetime the datetime to set
   */
  public void setDatetime(Long datetime) {
    this.datetime = datetime;
  }
 
}
