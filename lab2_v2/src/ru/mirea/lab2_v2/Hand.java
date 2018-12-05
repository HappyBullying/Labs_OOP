package ru.mirea.lab2_v2;

public class Hand {
    private String HandLength;//параметр, хранящий длину рук человека
    public Hand(String L){
        this.HandLength = L;
    }
    public String get_HandLength(){//получение значения
        return this.HandLength;
    }
}
