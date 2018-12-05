package ru.mirea.lab7_v2;
import java.lang.Math.*;
import java.util.LinkedList;
import  java.util.Random;
public class main {
    public  static void main(String[] args){
        LinkedList Test = new LinkedList();
        for (int i = 0; i <= 5; i++)//добавим кубы чисел
            Test.add(i*i*i);
        Test.add(new Dog());//добавим класс Dog

        ((Dog)(Test.get(6))).Voice();//вызовем метод элемента под индексом 5
        Test.addFirst(Math.PI);//Вставим пермым элементом число пи (double)
        Test.addLast(new Random());//Добавим последним класс Random
        System.out.println(Test.getLast().getClass());
        //выведем класс последнего элемента

        for (int i = 0; i < Test.size() - 1; i++)
            System.out.println(Test.get(i).getClass());
        //Выведем в цикле классы всех элементов от 1 до предпоследнего

        Test.clear();//очистим коллекцию
        System.out.println(Test.size());
        //Выведем размер получившегося списка
    }
}
