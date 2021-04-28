package ro.fasttrackit.curs11.homework;

import java.util.List;

public class BasketMain {
    public static void main(String[] args) {
        Basket basket = new Basket(List.of(
                "mar",
                "para",
                "struguri",
                "banana",
                "mar"
        ));

        System.out.println(basket.find("struguri"));
        System.out.println(basket.find("portocala"));

        System.out.println("remove struguri: " + basket.remove("struguri"));
        System.out.println("remove portocala: " + basket.remove("portocala"));
        System.out.println(basket.find("struguri"));

        System.out.println(basket.getPositions("mar"));

        System.out.println(basket.count());
    }
}
