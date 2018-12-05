package ru.mirea.lab4;

public class City implements Nameable {//класс City с интерфейсом Nameable
    protected String Name;
    City(String Nm){
        this.Name = Nm;
    }

    public String getName(){//определение метода из интерфейса
        return this.Name;
    }
}
