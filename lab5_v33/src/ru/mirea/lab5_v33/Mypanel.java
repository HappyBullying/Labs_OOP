package ru.mirea.lab5_v33;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;


public class Mypanel extends  JPanel {

    private Image im, im2;
    private Image current;//добавлено

    public Mypanel() {
        try {
            im = ImageIO.read(new File("C:\\Users\\aldui\\YandexDisk\\java\\lab5_v3\\src\\ru\\mirea\\lab5_v3\\1.png"));
            im2 = ImageIO.read(new File("C:\\Users\\aldui\\YandexDisk\\java\\\\lab5_v3\\src\\\\ru\\mirea\\lab5_v3\\2.png"));
            current = im; //добавлено
        } catch (IOException exception) {
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(current, 22, 22, null);

        for (int i = 1; i < 50; i++) {
            if (i%2 == 0)
                current = im2;
            else  current = im;
            try{
                Thread.sleep(3);
            } catch (Exception e){
                e.printStackTrace();
            }
            repaint();
        }
    }


}