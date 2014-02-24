/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain2;

import java.io.Serializable;

/**
 *
 * @author codekitten
 */

//name = "t_full_record"
public class FullRecord implements Serializable {
  
  private Integer id;
  
  //name = "seller_name", length = 50, nullable = false
  private String sellerName;
  
  //name = "product_name", length = 100, nullable = false
  private String productName;
  
  private Integer amount;
  
  //length = 200, nullable = false, unique = true
  private String url;
  
  private Double price;
  
  private Integer stock;
  
  //name = "max_price"
  private Double maxPrice;
  
  //name = "min_price"
  private Double minPrice;
  
  //length = 50
  private String remark;
  
  //length = 512
  private String promotion;
  
  private Long datetime;
  
  public FullRecord() {}
  
  public static FullRecord create(Integer id, String sellerName, String productName, Integer amount,
          String url, Double price, Integer stock, Double maxPrice, Double minPrice, String remark, 
          String promotion, Long datetime) {
    FullRecord fullRecord = new FullRecord();
    fullRecord.setId(id);
    fullRecord.setSellerName(sellerName);
    fullRecord.setProductName(productName);
    fullRecord.setAmount(amount);
    fullRecord.setUrl(url);
    fullRecord.setPrice(price);
    fullRecord.setStock(stock);
    fullRecord.setMaxPrice(maxPrice);
    fullRecord.setMinPrice(minPrice);
    fullRecord.setRemark(remark);
    fullRecord.setPromotion(promotion);
    fullRecord.setDatetime(datetime);
    return fullRecord;
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
   * @return the sellerName
   */
  public String getSellerName() {
    return sellerName;
  }

  /**
   * @param sellerName the sellerName to set
   */
  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  /**
   * @return the productName
   */
  public String getProductName() {
    return productName;
  }

  /**
   * @param productName the productName to set
   */
  public void setProductName(String productName) {
    this.productName = productName;
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
   * @return the price
   */
  public Double getPrice() {
    return price;
  }

  /**
   * @param price the price to set
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
   * @return the maxPrice
   */
  public Double getMaxPrice() {
    return maxPrice;
  }

  /**
   * @param maxPrice the maxPrice to set
   */
  public void setMaxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
  }

  /**
   * @return the minPrice
   */
  public Double getMinPrice() {
    return minPrice;
  }

  /**
   * @param minPrice the minPrice to set
   */
  public void setMinPrice(Double minPrice) {
    this.minPrice = minPrice;
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
