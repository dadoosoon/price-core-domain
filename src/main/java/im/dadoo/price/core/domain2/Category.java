/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain2;

import java.io.Serializable;

//t_category
public class Category implements Serializable {

  private Integer id;

  //length = 50, nullable = false, unique = true
  private String name;
  
  private Integer supId;
  
  public Category() {}
  
  public static Category create(String name, Integer supId) {
    Category category = new Category();
    category.name = name;
    category.supId = supId;
    return category;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(getId()).append(",");
    sb.append("name:").append(getName()).append(",");
    sb.append("supId:").append(supId);
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
   * @return the supId
   */
  public Integer getSupId() {
    return supId;
  }

  /**
   * @param supId the supId to set
   */
  public void setSupId(Integer supId) {
    this.supId = supId;
  }

}
