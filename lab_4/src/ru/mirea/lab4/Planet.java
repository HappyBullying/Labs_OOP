package ru.mirea.lab4;

public class Planet implements Nameable {//класс Planet с интерфейсом Nameable

    protected  String Name;
    Planet(String Nm){
        this.Name = Nm;
    }
    public String getName(){//определение метода из интерфейса
        return this.Name;
    }
}
