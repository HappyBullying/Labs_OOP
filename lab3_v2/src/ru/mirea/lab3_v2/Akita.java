package ru.mirea.lab3_v2;

public class Akita extends  Dog {
    Akita(String Bark, int al, int aw, String type){//конструктор, который задаёт параметры породы
        this.AverageLifeTime = al;
        this.AvrageWeight = aw;
        this.barkvoice = Bark;
        this.type = type;
    }
}
