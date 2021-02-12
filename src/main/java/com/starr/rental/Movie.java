package com.starr.rental;

import lombok.Getter;

public class Movie {

    public static final int REGULAR = 0;
    public static final int CHILDREN = 1;
    public static final int NEW_RELEASE = 2;

    @Getter
    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public Price getPrice() {
        return price;
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDREN:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code.");
        }
    }
}
