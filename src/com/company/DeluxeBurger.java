package com.company;

import java.util.ArrayList;

public class DeluxeBurger extends Burger{

    public DeluxeBurger(String name, String roll, String meat, double price, Addition chips, Addition drinks) {
        super(name, roll, meat, price, 2);
        addAddition(chips);
        addAddition(drinks);

    }


}
