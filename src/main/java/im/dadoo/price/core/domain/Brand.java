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
import javax.persistence.Table;

@Entity
@Table(name = "t_brand")
public class Brand implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
 
  @Column(length = 50, nullable = false, unique = true)
  private String name;
  
  @Column(nullable = true)
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
    sb.append("id:").append(id).append(",");
    sb.append("name:").append(name).append(",");
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
