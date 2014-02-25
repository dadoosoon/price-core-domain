/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain3;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_product")
public class Product implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(length = 100, nullable = false, unique = true)
  private String name;
  
  @Column(name = "thumbnail_path", length = 100, nullable = true)
  private String thumbnailPath;
  
  @ManyToOne
  @JoinColumn(name = "category_brand_id", nullable = false)
  private CategoryBrand categoryBrand;
  
  public Product() {}
  
  public static Product create(String name, String thumbnailPath, CategoryBrand categoryBrand) {
    Product product = new Product();
    product.setName(name);
    product.setThumbnailPath(thumbnailPath);
    product.setCategoryBrand(categoryBrand);
    return product;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(id).append(",");
    sb.append("name:").append(name).append(",");
    sb.append("thumbnailPath:").append(getThumbnailPath()).append(",");
    sb.append("categoryBrand:").append(getCategoryBrand());
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
   * @return the categoryBrand
   */
  public CategoryBrand getCategoryBrand() {
    return categoryBrand;
  }

  /**
   * @param categoryBrand the categoryBrand to set
   */
  public void setCategoryBrand(CategoryBrand categoryBrand) {
    this.categoryBrand = categoryBrand;
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

  
}
