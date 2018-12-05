package ru.mirea.lab_3;
import java.util.Scanner;

public abstract class Dish {

    protected String type;
    private String status;

    public String Get_type(){
        return  this.type;
    }

    public String Get_status(){
        return this.status;
    }

    public void Set_status(String st){
        this.status = st;
    }
}
