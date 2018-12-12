package ru.mirea.lab5_v33;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.Time;
import javax.imageio.*;


public class Mypanel extends  JPanel {

    private Image im, im2;//два объекта - картинки
    private Image current;//текущаяя картинка

    public Mypanel() {
        try {
            im = ImageIO.read(new File("D:\\yadisk\\YandexDisk\\java\\lab5_v33\\1.png"));//пусть к первой картинке
            im2 = ImageIO.read(new File("D:\\yadisk\\YandexDisk\\java\\lab5_v33\\2.png"));//путь ко второй картинке
            current = im; //добавлено
        } catch (IOException exception) {
        }
    }
    int counter = 0;//переменная для счёта смен картинок
    public void paintComponent(Graphics g) {//метод для отричовки картинки в UI
        super.paintComponent(g);
        g.drawImage(current, 22, 22, null);//отрисовка текущей картинки

        Timer clock = new Timer(1000, new ActionListener() {//таймер на смену картринки
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter % 2 == 0) {
                    current = im;
                } else {
                    current = im2;
                }
                counter+=1;
                repaint();//переотрисовка картинки
                if (counter >=50)
                    System.exit(0);//выход по достижению числа смен
            }
        });
        clock.start();//запуск таймера

    }


}