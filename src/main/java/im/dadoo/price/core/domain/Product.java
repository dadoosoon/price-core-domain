/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain;

import java.io.Serializable;

//name = "t_product"
public class Product implements Serializable {

  private Integer id;

  //length = 100, nullable = false, unique = true
  private String name;
  
  //name = "thumbnail_path", length = 100, nullable = true
  private String thumbnailPath;
  
  //name = "category_brand_id", nullable = false
  private Integer categoryBrandId;
  
  public Product() {}
  
  public static Product create(String name, String thumbnailPath, Integer categoryBrandId) {
    Product product = new Product();
    product.setName(name);
    product.setThumbnailPath(thumbnailPath);
    product.setCategoryBrandId(categoryBrandId);
    return product;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(id).append(",");
    sb.append("name:").append(name).append(",");
    sb.append("thumbnailPath:").append(getThumbnailPath()).append(",");
    sb.append("categoryBrandId:").append(getCategoryBrandId());
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
   * @return the thumbnailPath
   */
  public String getThumbnailPath() {
    return thumbnailPath;
  }

  /**
   * @param thumbnailPath the thumbnailPath to set
   */
  public void setThumbnailPath(String thumbnailPath) {
    this.thumbnailPath = thumbnailPath;
  }

  /**
   * @return the categoryBrandId
   */
  public Integer getCategoryBrandId() {
    return categoryBrandId;
  }

  /**
   * @param categoryBrandId the categoryBrandId to set
   */
  public void setCategoryBrandId(Integer categoryBrandId) {
    this.categoryBrandId = categoryBrandId;
  }

}
