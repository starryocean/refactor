package com.starr.rental;

public class ChildrensPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double getCharge(int daysRented) {
        double charge = 1.5;
        if (daysRented > 3) {
            charge += (daysRented - 3) * 1.5;
        }
        return charge;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
