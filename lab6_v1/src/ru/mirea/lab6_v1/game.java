package ru.mirea.lab6_v1;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.sql.Time;
import java.util.EventListener;
import java.util.Random;
import javax.swing.*;
import  java.util.SplittableRandom;
import java.util.concurrent.TimeUnit;

public class game extends  JFrame {
    int trys = 3;//счётчик попыток
    JTextField smallField;
    Random r;//рандомайзер
    JLabel check;//лейбля для отображения верно/неверно
    int randomed;//число хранящее число из рандомайзера
    public game(){

        super("Текстовые поля");
        r = new Random();
        randomed = r.nextInt(19) + 1;//рандом числа от 1 до 20
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание текстовых полей
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");

        check = new JLabel("");
        JLabel countlabel = new JLabel("Осталось попыток: "+ trys);
        JButton enter = new JButton("Принять");//кнопка для ввода числа
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));//универсальный контейнер класса jpanel

        check.setVisible(true);
        enter.addActionListener(new ActionListener() {//обработчик кнопки
            @Override
            public void actionPerformed(ActionEvent e) {

                    if (Integer.parseInt(smallField.getText()) != randomed){//условие при несовпадении числа со случайным
                        trys--;
                        countlabel.setText("Осталось попыток: " + trys);
                        check.setText("Неверно");
                        if (trys == 0){
                            try {
                                Thread.sleep(1000);
                            } catch (Exception E) {
                                E.printStackTrace();
                            }
                            System.exit(0);
                        }
                    } else {//совпадение числа со случайным
                        check.setText("Верно");
                        Timer tm = new Timer(1000, new ActionListener() {//таймер на секундню отсрочку перед закрытием
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                            }
                        });
                        tm.start();
                    }
            }
        });

        contents.add(check);//добавление элементов в контейнер
        contents.add(smallField);
        contents.add(countlabel);
        contents.add(enter);
        setContentPane(contents);
        setSize(400, 130);
        setVisible(true);
            }



}
