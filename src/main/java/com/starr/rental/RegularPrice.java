package com.starr.rental;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double charge = 2;
        if (daysRented > 2) {
            charge += (daysRented - 2) * 1.5;
        }
        return charge;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
