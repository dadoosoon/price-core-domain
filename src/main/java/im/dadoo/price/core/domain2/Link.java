/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain2;

import java.io.Serializable;

//name = "t_link"
public class Link implements Serializable {

  private Integer id;

  //nullable = false
  private Integer amount;

  //nullable = false
  private String url;
  
  //length = 50, nullable = true
  private String remark;

  //name = "seller_id", nullable = false
  private Integer sellerId;

  //name = "product_id", nullable = false
  private Integer productId;
  
  public Link() {}
  
  public static Link create(String url, Integer amount, String remark, 
          Integer sellerId, Integer productId) {
    Link link = new Link();
    link.setUrl(url);
    link.setAmount(amount);
    link.setRemark(remark);
    link.setSellerId(sellerId);
    link.setProductId(productId);
    return link;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(id).append(",");
    sb.append("amount:").append(amount).append(",");
    sb.append("remark:").append(remark).append(",");
    sb.append("url:").append(url).append(",");
    sb.append("productId:").append(getProductId()).append(",");
    sb.append("seller:").append(getSellerId());
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
   * @return the remark
   */
  public String getRemark() {
    return remark;
  }

  /**
   * @param remark the remark to set
   */
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * @return the sellerId
   */
  public Integer getSellerId() {
    return sellerId;
  }

  /**
   * @param sellerId the sellerId to set
   */
  public void setSellerId(Integer sellerId) {
    this.sellerId = sellerId;
  }

  /**
   * @return the productId
   */
  public Integer getProductId() {
    return productId;
  }

  /**
   * @param productId the productId to set
   */
  public void setProductId(Integer productId) {
    this.productId = productId;
  }
  
}
