package ru.mirea.lab4;

public class main {
    public static void main(String[] args){

        Planet earth = new Planet("Earth");//создаём объект класса Planet
        City stockholm = new City("Stockholm");//создаём объект класса City
        Person man = new Person("Andy");//создаём объект класса Person

        System.out.println(earth.getName());//выводим имя
        System.out.println(stockholm.getName());//выводим имя
        System.out.println(man.getName());//выводим имя

    }

}
