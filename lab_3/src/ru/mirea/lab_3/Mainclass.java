package ru.mirea.lab_3;
import  static  java.lang.System.out;
public class Mainclass {
    public static void main(String[] args){

        Plate pl = new Plate();
        Glass gl = new Glass();
        out.println(pl.Get_type());
        pl.Set_status("clean");
        out.println(pl.Get_status());

        out.println(gl.Get_type());
        gl.Set_status("durty");
        out.println(gl.Get_status());

        Cup cp = new Cup();
        out.println(cp.Get_type());
        cp.Set_status("clean");
        out.println(cp.Get_status());




    }
}
