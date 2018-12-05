package ru.mirea.lab3_v2;

public class mainclass {
    public  static void  main(String [] args){

        Akita one = new Akita("AYYY-AYY", 12, 50, "Akita");
        Shibe two = new Shibe("AYYYY", 13, 45, "Shibe");
        Pitbull three = new Pitbull("WOOF - WOOF", 14, 16,"Pitbull");

        System.out.println(one.get_AverageLifeTime()+"\n"+one.get_AverageWeight()+"\n"+one.get_type()+"\n");

        System.out.println(two.get_AverageLifeTime()+"\n"+two.get_AverageWeight()+"\n"+two.get_type()+"\n");

        System.out.println(three.get_AverageLifeTime()+"\n"+three.get_AverageWeight()+"\n"+three.get_type()+"\n");
    }
}
