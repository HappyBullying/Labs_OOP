package ru.mirea.lab5_v33;
import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class MyFrame extends JFrame {

    public MyFrame()
    {
        setTitle("Checkers");//название окна UI
        setSize(992,1006);//размер окна UI
        Mypanel panel= new Mypanel();//экземпляр класса
        Container pane=getContentPane();//контейнер UI
        pane.add(panel);//добавление созданного класса
    }
}
