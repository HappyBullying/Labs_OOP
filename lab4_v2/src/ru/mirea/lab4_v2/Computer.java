package ru.mirea.lab4_v2;

public class Computer implements  Priceable{
    protected double Price;
    Computer(double Pr){
        this.Price = Pr;
    }

    public double getPrice(){//определение метода getPrice
        return this.Price;
    }
}
