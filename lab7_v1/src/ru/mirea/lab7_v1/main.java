package ru.mirea.lab7_v1;
import java.util.Random;
import java.util.ArrayList;

public class main {
    public  static void main(String[] args){
        ArrayList Test = new ArrayList();

        for (int i = 1; i <= 5; i++)//добавим в коллекцию квадраты чисел от 1 до 5
            Test.add(i*i);
        Test.add(new Dog());

        Test.add(new Random());
        ((Dog)Test.get(5)).Voice();//при получении жлемента из коллекции необходимо
        // привести его к его исходному типу данных, чтобы им воспользоваться
        System.out.println(Test.indexOf(16));//Выведем индекс элемента равного квадрату 4

        System.out.println(Test.contains(25));/*проверим
        наличие квадрата пяти в коллекции*/
        Test.set(2, ((int)Test.get(2))*((int)Test.get(2)));/*
        заменим элемент с индексом 2 (9) на его квадрат*/
        Test.remove(0);//удалим первый элемент
        for (int i = 0; i < Test.size(); i++)
            System.out.println(Test.get(i).getClass());
        /*в цикле for от 0 до длины Test (метод size())
        выведем типы всех классов в нём
         */
        Test.clear();//очистим arraylist
        System.out.println(Test.size());//Выведем получившуюся длину
    }
}
