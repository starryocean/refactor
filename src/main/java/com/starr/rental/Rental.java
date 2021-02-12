package com.starr.rental;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
/**
 * 表示客户租了一部影片
 */
public class Rental {

  private String userId;
  private int daysRented;
  private Movie movie;
  private int rent;

  public int getRent() {
    return this.rent;
  }

  public double getCharge() {
    return movie.getPrice().getCharge(daysRented);
  }

  public int getFrequentRenterPoints(int daysRented) {
    return movie.getPrice().getFrequentRenterPoints(daysRented);
  }
}
