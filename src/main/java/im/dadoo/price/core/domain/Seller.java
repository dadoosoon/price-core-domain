/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain;

import java.io.Serializable;

//name = "t_seller"
public class Seller implements Serializable {

  private Integer id;
  
  //length = 50, nullable = false, unique = true
  private String name;

  //length = 100, nullable = true
  private String site;
  
  //default = 15000
  private Long delay;
  
  public Seller() {}
  
  public static Seller create(String name, String site) {
    Seller seller = new Seller();
    seller.setName(name);
    seller.setSite(site);
    return seller;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(getId()).append(",");
    sb.append("name:").append(getName()).append(",");
    sb.append("site:").append(getSite()).append(",");
    sb.append("delay:").append(getDelay());
    sb.append("}");
    return sb.toString();
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
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
   * @return the site
   */
  public String getSite() {
    return site;
  }

  /**
   * @param site the site to set
   */
  public void setSite(String site) {
    this.site = site;
  }

  /**
   * @return the delay
   */
  public Long getDelay() {
    return delay;
  }

  /**
   * @param delay the delay to set
   */
  public void setDelay(Long delay) {
    this.delay = delay;
  }
  
}
