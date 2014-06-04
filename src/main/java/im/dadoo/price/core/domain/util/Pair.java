/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package im.dadoo.price.core.domain.util;

/**
 *
 * @author shuwen.zsw
 */
public final class Pair<L, R> {
  
  private L l;
  private R r;
  
  public Pair() {
    this.l = null;
    this.r = null;
  }
  
  public Pair(L l, R r) {
    this.l = l;
    this.r = r;
  }

  /**
   * @return the l
   */
  public L getL() {
    return l;
  }

  /**
   * @param l the l to set
   */
  public void setL(L l) {
    this.l = l;
  }

  /**
   * @return the r
   */
  public R getR() {
    return r;
  }

  /**
   * @param r the r to set
   */
  public void setR(R r) {
    this.r = r;
  }
 
}
