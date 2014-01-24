/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author codekitten
 */
@Entity
@Table(name = "v_latest_record")
public class LatestRecord implements Serializable {
  
  @Id
  private Integer id;
  
  @ManyToOne
  @JoinColumn(name = "link_id", nullable = false)
  private Link link;
  
  @ManyToOne
  @JoinColumn(name = "record_id", nullable = false)
  private Record record;
  
  @Column(name = "max_price")
  private Double maxPrice;
  
  @Column(name = "min_price")
  private Double minPrice;
  
  public LatestRecord() {}
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    sb.append("id:").append(this.id).append(",");
    sb.append("link:").append(this.link).append(",");
    sb.append("record:").append(this.record).append(",");
    sb.append("maxPrice:").append(maxPrice).append(",");
    sb.append("minPrice:").append(minPrice);
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
   * @return the link
   */
  public Link getLink() {
    return link;
  }

  /**
   * @param link the link to set
   */
  public void setLink(Link link) {
    this.link = link;
  }

  /**
   * @return the latestRecord
   */
  public Record getRecord() {
    return record;
  }

  /**
   * @param latestRecord the latestRecord to set
   */
  public void setrRecord(Record record) {
    this.record = record;
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
  
}
