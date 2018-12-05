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
        setTitle("Checkers");
        setSize(992,1006);
        Mypanel panel= new Mypanel();
        Container pane=getContentPane();
        pane.add(panel);
    }
}
