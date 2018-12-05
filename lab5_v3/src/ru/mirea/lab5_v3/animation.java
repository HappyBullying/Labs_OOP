package ru.mirea.lab5_v3;
import com.sun.javaws.util.JfxHelper;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;


public class animation extends Canvas {//класс imageviewer наследуемый от Convas
    //Convas используется рисования, с помощью переорпеделения в потомке метода paint

    protected String strargs1, strargs2;//путь к картинке

    animation(String[] ar) {
        this.strargs1 = ar[0];
        this.strargs2 = ar[1];
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("ImageViewer");//объявленике класса Jframe с названием окна ImageViewer
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//метод используется для указания одной из нескольких опций кнопки закрытия.

                BufferedImage img = null;//объявляем объект класса BufferImage(BufferImage - потомок класса Image)
                try {//блок try - catch для того чтобы не было необработанных исключений при неправильном пути файла
                    img = ImageIO.read(new File(strargs1));
                } catch (Exception e){
                    e.printStackTrace();
                }

                JLabel label = new JLabel();//объект классса Jlabel чтобы поместить в него изображение
                label.setIcon(new ImageIcon(img));//помещаем изображение (объект img)
                frame.getContentPane().add(label,BorderLayout.CENTER);//через метод getContentPane()
                //добавлям элеиент в окно
                frame.pack();//Метод pack определяет размер кадра таким образом,
                // чтобы все его содержимое находилось на уровне или превышало их предпочтительные размеры
                frame.setLocationRelativeTo(null);//позиционирование окна по центру экрана
                frame.setVisible(true);//приложение запущено





               for (int i = 1; i < 50; i++){

                    try{
                    Thread.sleep(10);}
                    catch (Exception te){
                        te.printStackTrace();
                    }
                    try {
                        if (i%2 == 0)
                        img = ImageIO.read(new File("C:\\Users\\aldui\\YandexDisk\\java\\lab5_v3\\src\\ru\\mirea\\lab5_v3\\2.png"));
                        else  img =  ImageIO.read(new File("C:\\Users\\aldui\\YandexDisk\\java\\lab5_v3\\src\\ru\\mirea\\lab5_v3\\1.png"));
                    } catch (Exception e){
                        e.printStackTrace();
                    }

                    label.setIcon(new ImageIcon(img));
                    frame.getContentPane().add(label,BorderLayout.CENTER);
                   try {
                       Thread.sleep(10);
                   } catch (Exception e){
                       e.printStackTrace();
                   }
                }
            }
        });
    }





}