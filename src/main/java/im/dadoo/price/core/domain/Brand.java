/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain;

import java.io.Serializable;

public class Brand implements Serializable {

  private Integer id;
 
  //length = 50, nullable = false, unique = true
  private String name;
  
  //nullable = true
  private String info;
  
  public Brand() {}

  public static Brand create(String name, String info) {
    Brand brand = new Brand();
    brand.name = name;
    brand.setInfo(info);
    return brand;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(getId()).append(",");
    sb.append("name:").append(getName()).append(",");
    sb.append("info:").append(getInfo());
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
   * @return the info
   */
  public String getInfo() {
    return info;
  }

  /**
   * @param info the info to set
   */
  public void setInfo(String info) {
    this.info = info;
  }
  
}
