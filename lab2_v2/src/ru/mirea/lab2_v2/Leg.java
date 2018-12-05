package ru.mirea.lab2_v2;

public class Leg {
    private String LegLength;//параметр, хранящий длину ноги человека
    Leg(String L){
        this.LegLength = L;
    }
    public String get_LegLength(){//получение значения
        return this.LegLength;
    }
}
