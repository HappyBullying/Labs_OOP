package ru.mirea.lab4_v2;

public class Dollar implements Priceable {
    protected double Price;
    Dollar(double Pr){
        this.Price = Pr;
    }
    public double getPrice(){//определение метода getPrice
        return this.Price;
    }
}
