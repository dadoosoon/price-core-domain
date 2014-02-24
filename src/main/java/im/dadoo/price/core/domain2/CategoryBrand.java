/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain2;

import java.io.Serializable;

//t_category_brand
public class CategoryBrand implements Serializable {

  private Integer id;

  //name = "category_id", nullable = false
  private Integer categoryId;

  //name = "brand_id", nullable = false
  private Integer brandId;
  
  public CategoryBrand() {}
  
  public static CategoryBrand create(Integer categoryId, Integer brandId) {
    CategoryBrand cb = new CategoryBrand();
    cb.setCategoryId(categoryId);
    cb.setBrandId(brandId);
    return cb;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(getId()).append(",");
    sb.append("categoryId:").append(getCategoryId()).append(",");
    sb.append("brandId:").append(getBrandId());
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
   * @return the categoryId
   */
  public Integer getCategoryId() {
    return categoryId;
  }

  /**
   * @param categoryId the categoryId to set
   */
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * @return the brandId
   */
  public Integer getBrandId() {
    return brandId;
  }

  /**
   * @param brandId the brandId to set
   */
  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  
}
