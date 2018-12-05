package ru.mirea.lab4_v2;

public class Car implements Priceable {
    protected double Price;
    Car(double Pr){
        this.Price = Pr;
    }

    public double getPrice(){//определение метода getPrice
        return this.Price;
    }
}
