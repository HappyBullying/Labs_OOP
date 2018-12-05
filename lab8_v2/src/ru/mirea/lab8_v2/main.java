package ru.mirea.lab8_v2;
import  java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args){

        FileReader read;//объявляем объект класса filereader

        try{
            read = new FileReader("C:\\Users\\aldui\\text.txt");//открываем файл
            char[] buf = new char[256];
            int c;
            while((c = read.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);//копируем массив в самого себя с учётом элементов
                }
                System.out.print(buf);//выводим на экран//read.close();//закрываем файл
            }
        } catch (Exception E){
            E.printStackTrace();
        }
    }
}
