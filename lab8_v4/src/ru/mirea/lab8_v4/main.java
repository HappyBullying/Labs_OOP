package ru.mirea.lab8_v4;
import  java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import  java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);//Класс сканер
        FileWriter pen;//создаём класс filewriter

        try{
            String ms = new String(r.next());//читаем строку с клавиатуры
            pen = new FileWriter("C:\\Users\\aldui\\text.txt", true);
            //открываем файл с продолжением записи
            pen.write(ms);//записываем строку
            pen.close();//закрываем файл

        } catch (Exception E){
            E.printStackTrace();
        }
    }
}
