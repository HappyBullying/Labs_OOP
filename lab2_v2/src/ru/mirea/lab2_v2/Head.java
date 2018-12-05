package ru.mirea.lab2_v2;

public class Head
{
    private String HeadVolume;//параметр, хранящий объём черепной коробки
    Head(String V){
        this.HeadVolume = V;
    }
    public String get_HeadVolume(){//получение значения
        return this.HeadVolume;
    }
}
