package ru.mirea.lab5;
import com.sun.javaws.util.JfxHelper;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;


public class imageviewer extends Canvas {//класс imageviewer наследуемый от Convas
    //Convas используется рисования, с помощью переорпеделения в потомке метода paint

    protected String strargs;//путь к картинке

    imageviewer(String ar) {
        this.strargs = ar;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("ImageViewer");//объявленике класса Jframe с названием окна ImageViewer
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//метод используется для указания одной из нескольких опций кнопки закрытия.

                BufferedImage img = null;//объявляем объект класса BufferImage(BufferImage - потомок класса Image)
                try {//блок try - catch для того чтобы не было необработанных исключений при неправильном пути файла
                    img = ImageIO.read(new File(strargs));
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
            }
        });
    }



}


