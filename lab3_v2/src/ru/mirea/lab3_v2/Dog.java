package ru.mirea.lab3_v2;

public abstract class Dog {

    protected String barkvoice;//поле, хранящее звук с которым лаит порода собак
    protected  int AverageLifeTime;//среднее время жизни порды
    protected  int AvrageWeight;//средний вес собаки породы
    protected  String type;
    public void Bark(){//Гавканье
        System.out.println(this.barkvoice);
    }

    public int get_AverageLifeTime(){//метод для получения среднего времяни жизни породы
        return this.AverageLifeTime;
    }

    public int get_AverageWeight(){//методу получения среднего веса породы
        return this.AvrageWeight;
    }

    public String get_type(){
        return this.type;
    }
}
