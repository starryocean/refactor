package com.starr.rental;

import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer {

  //姓名
  private String name;
  //租赁明细
  private Vector<Rental> rentals = new Vector<Rental>();

  public Customer(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Vector<Rental> getRentals() {
    return this.rentals;
  }

  public void addRental(Rental rental) {
    this.rentals.add(rental);
  }

  public String statement() {
    Enumeration eRentals = rentals.elements();
    double totalAmount = 0d;
    String result = "Rental Record for " + getName() + "\n";
    //计算费用
    while (eRentals.hasMoreElements()) {
      Rental rental = (Rental) eRentals.nextElement();
      //打印明细
      totalAmount += rental.getCharge();
      result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
    }
    //add footer lines
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points.";
    return result;
  }

  private int getTotalFrequentRenterPoints() {
    int result = 0;
    Enumeration eRentals = rentals.elements();
    while (eRentals.hasMoreElements()) {
      Rental rental = (Rental) eRentals.nextElement();
      result += rental.getFrequentRenterPoints(rental.getDaysRented());
    }
    return result;
  }
}
