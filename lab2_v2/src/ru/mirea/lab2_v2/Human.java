package ru.mirea.lab2_v2;

public class Human {
    Head head = null;//объявление объектов классов Head Leg Hand, которые являются полями класса
    Leg leg = null;
    Hand hand = null;
    private int age;

    Human(int age, String HeadV,String LegL, String HandL){//конструктор класса Human, который задаёт значеничя полям
        this.head = new Head(HeadV);
        this.leg = new Leg(LegL);
        this.hand = new Hand(HandL);
        this.age = age;
    }

    public void GetCharacterParams(){//метод для вывода значений параметоров
        System.out.println("Возраст: "+this.age);
        System.out.println("Объём черепной коробки: "+ this.head.get_HeadVolume());
        System.out.println("Длина руки: "+ this.hand.get_HandLength());
        System.out.println("Длина ноги: "+this.leg.get_LegLength());
    }
}
