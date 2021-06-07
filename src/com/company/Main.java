package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Addition lettuce = new Addition("Lettuce", 1.00);
        Addition tomato = new Addition("Tomato", 1.50);
        Addition carrot =new Addition("Carrot", 1.00);
        Addition onion =new Addition("Onion", 1.00);
        Addition zucchini  = new Addition("Zucchini", 1.00);

        Addition chips = new Addition("Chips", 4.00);
        Addition drinks = new Addition("Soft drinks", 2.50);

        Addition bacon = new Addition("Bacon", 3.50);

        Burger chickenBurger  = new Burger("Basic Chicken","Corn bread", "Chicken", 8.00,4);
        chickenBurger.addAddition(lettuce);
        chickenBurger.addAddition(tomato);
        chickenBurger.addAddition(carrot);
        chickenBurger.addAddition(onion);
        chickenBurger.addAddition(zucchini);
        chickenBurger.getBurgerInfo();


        DeluxeBurger deluxe = new DeluxeBurger("Deluxe Yum","Wholemeal","Beef",12.00, chips, drinks);
        deluxe.addAddition(bacon);
        deluxe.getBurgerInfo();

        HealthyBurger healthy = new HealthyBurger("Healthy Yum","Brow Rye","Pork",11.00);
        healthy.addAddition(bacon);
        healthy.addAddition(lettuce);
        healthy.addAddition(tomato);
        healthy.addAddition(carrot);
        healthy.addAddition(onion);
        healthy.addAddition(zucchini);
        healthy.addAddition(drinks);

        healthy.getBurgerInfo();



    }
}
