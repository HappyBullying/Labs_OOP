package ru.mirea.lab4_v2;

public class mainclass {
    public  static void main(String [] args){

        Car Volga = new Car(10000);//экземпляр класса Car
        Dollar OchenDorogo = new Dollar(100);//экземпляр класса Dollar
        Computer play = new Computer(200000);//экземпляр класса Computer


        System.out.println(Volga.getPrice()+" CarPrice");//вывод цен
        System.out.println(OchenDorogo.getPrice() + " DollarPrice");
        System.out.println(play.getPrice() + " ComputerPrice");

    }
}
