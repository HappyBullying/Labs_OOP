package ru.mirea.lav8_v1;
import java.io.*;
import java.util.Scanner;

public class main {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);//Создаём объект класса Scanner
        String msg;//Объект класса String, для хранения строки
        FileWriter pen;//обхект класса FileWriter
        try{
             pen = new FileWriter("C:\\Users\\aldui\\text.txt");//открытие файла
             for(int i = 0; i < 5; i++){
                 msg = input.next().toString();//чтение строки
                 msg+="\n";//перевод на новую строку
                 pen.write(msg);//запись в файл
                 msg = "";
             }
             pen.close();//закрываем поток и файл
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
