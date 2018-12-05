package ru.mirea.lab4;

public class Person implements Nameable {//класс Person с интерфейсом Nameable
    protected String Name;

    Person(String Nm){
        this.Name = Nm;
    }

    public String getName(){//определение метода из интерфейса
        return this.Name;
    }
}
