package com.starr.rental;

public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    public abstract int getFrequentRenterPoints(int daysRented);
}
