package com.starr.rental;

/**
 * 需求
 * 设计一个影片出租店用的程序,计算每一位顾客的消费金额并打印详单
 * 操作者告诉程序:顾客租了哪些影片、租期多长,程序便根据租赁时间和影片类型计算出费用
 * 除了计算费用外,还要为客户计算积分,积分根据租片的种类是否为新片而不同
 *
 * 分类规则和计算规则
 */
public class Main {
    public static void main(String[] args) {
        Customer starr = new Customer("starr");

        Rental rental1 = new Rental();
        rental1.setMovie(new Movie("Movie 1", Movie.REGULAR));
        rental1.setDaysRented(1);
        starr.addRental(rental1);

        Rental rental2 = new Rental();
        rental2.setMovie(new Movie("Movie 2", Movie.CHILDREN));
        rental2.setDaysRented(4);
        starr.addRental(rental2);

        Rental rental3 = new Rental();
        rental3.setMovie(new Movie("Movie 3", Movie.NEW_RELEASE));
        rental3.setDaysRented(5);
        starr.addRental(rental3);

        String result = starr.statement();
        System.out.println(result);
    }
}
