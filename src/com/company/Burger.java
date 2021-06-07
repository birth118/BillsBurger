package com.company;

import java.util.ArrayList;

public class Burger {
    private String name;
    private String roll;
    private String meat;
    private double price;
   // private Addition additions[];
    private ArrayList<Addition> additions;
    private int numberOfAdditions;

    public Burger(String name, String roll, String meat, double price,int numberOfAdditions) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.numberOfAdditions =  numberOfAdditions;

        additions = new ArrayList<Addition>(numberOfAdditions);

    }

    public ArrayList<Addition> getAdditions() {
        return additions;
    }

    public void addAddition(Addition addition) {
        if(additions.toArray().length < getNumberOfAdditions() ) {
            additions.add(addition);
        }else{
            System.out.println("Error:" + addition.getName()+ "--> Maximum additions up to " + getNumberOfAdditions() );
        }
//        return getAdditions();

    }

    private int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public void getBurgerInfo(){
        double burgerPrice = this.price;
        System.out.println("Name: " + name);
        System.out.println(" - Roll: " + roll);
        System.out.println(" - Meat: " + meat);

        for(int i = 0; i < additions.toArray().length; i++){
            String name = additions.get(i).getName();
            double additionPrice = additions.get(i).getPrice();
            System.out.println("   - Added: " + name );
            burgerPrice += additionPrice;
        }
        System.out.println("Price: $" + burgerPrice);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
