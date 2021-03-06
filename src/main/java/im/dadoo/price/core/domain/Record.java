/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain;

import java.io.Serializable;

/**
 *
 * @author codekitten
 */
//name = "t_record"
public class Record implements Serializable {
  
  private Integer id;
  
  //nullable = true
  private Double price;
  
  //nullable = true
  private Integer stock;
  
  //length = 512, nullable = true
  private String promotion;
  
  //name = "link_id", nullable = false
  private Integer linkId;
  
  //nullable = false
  private Long datetime;
  
  public Record() {}
  
  public static Record create(Double price, Integer stock, String promotion,
          Integer linkId, Long datetime) {
    Record record = new Record();
    record.price = price;
    record.stock = stock;
    record.promotion = promotion;
    record.linkId = linkId;
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
    sb.append("promotion:").append(promotion).append(",");
    sb.append("linkId:").append(getLinkId()).append(",");
    sb.append("datetime:").append(datetime);
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

  /**
   * @return the promotion
   */
  public String getPromotion() {
    return promotion;
  }

  /**
   * @param promotion the promotion to set
   */
  public void setPromotion(String promotion) {
    this.promotion = promotion;
  }

  /**
   * @return the linkId
   */
  public Integer getLinkId() {
    return linkId;
  }

  /**
   * @param linkId the linkId to set
   */
  public void setLinkId(Integer linkId) {
    this.linkId = linkId;
  }
  
}
