package ru.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {
    double number, answer;
    int calculation;

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();

    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton dot = new JButton(".");
    JButton bClear = new JButton("C");
    JButton bDelete = new JButton("DEL");
    JButton equal = new JButton("=");
    JButton mul = new JButton("x");
    JButton div = new JButton("/");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");

    Calc() {
        windowCalc();
        addButtons();
        action();
    }

    public void windowCalc() {
        frame = new JFrame();
        frame.setTitle("Глупый калькулятор");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.orange);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addButtons() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        b7.setBounds(10, 170, 60, 40);
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b7);

        b8.setBounds(80, 170, 60, 40);
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b8);

        b9.setBounds(150, 170, 60, 40);
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b9);

        b4.setBounds(10, 230, 60, 40);
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b4);

        b5.setBounds(80, 230, 60, 40);
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b5);

        b6.setBounds(150, 230, 60, 40);
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b6);

        b1.setBounds(10, 290, 60, 40);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b1);

        b2.setBounds(80, 290, 60, 40);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b2);

        b3.setBounds(150, 290, 60, 40);
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b3);

        dot.setBounds(150, 350, 60, 40);
        dot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(dot);

        b0.setBounds(10, 350, 130, 40);
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(b0);

        equal.setBounds(220, 350, 60, 100);
        equal.setFont(new Font("Arial", Font.BOLD, 20));
        equal.setBackground(Color.black);
        equal.setForeground(Color.white);
        frame.add(equal);

        div.setBounds(220, 110, 60, 40);
        div.setFont(new Font("Arial", Font.BOLD, 20));
        div.setBackground(Color.black);
        div.setForeground(Color.white);
        frame.add(div);

        mul.setBounds(220, 230, 60, 40);
        mul.setFont(new Font("Arial", Font.BOLD, 20));
        mul.setBackground(Color.black);
        mul.setForeground(Color.white);
        frame.add(mul);

        minus.setBounds(220, 170, 60, 40);
        minus.setFont(new Font("Arial", Font.BOLD, 20));
        minus.setBackground(Color.black);
        minus.setForeground(Color.white);
        frame.add(minus);

        plus.setBounds(220, 290, 60, 40);
        plus.setFont(new Font("Arial", Font.BOLD, 20));
        plus.setBackground(Color.black);
        plus.setForeground(Color.white);
        frame.add(plus);

        bDelete.setBounds(150, 110, 60, 40);
        bDelete.setFont(new Font("Arial", Font.BOLD, 12));
        bDelete.setBackground(Color.red);
        bDelete.setForeground(Color.white);
        frame.add(bDelete);

        bClear.setBounds(80, 110, 60, 40);
        bClear.setFont(new Font("Arial", Font.BOLD, 12));
        bClear.setBackground(Color.red);
        bClear.setForeground(Color.white);
        frame.add(bClear);

    }

    public void action() {

        bClear.addActionListener(this);
        bDelete.addActionListener(this);
        div.addActionListener(this);
        minus.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        mul.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        plus.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        equal.addActionListener(this);
        b0.addActionListener(this);
        dot.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            if (source == bClear) {
            label.setText("");
            textField.setText("");
        } else if (source == bDelete) {
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == b0) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == b1) {
            textField.setText(textField.getText() + "1");
        } else if (source == b2) {
            textField.setText(textField.getText() + "2");
        } else if (source == b3) {
            textField.setText(textField.getText() + "3");
        } else if (source == b4) {
            textField.setText(textField.getText() + "4");
        } else if (source == b5) {
            textField.setText(textField.getText() + "5");
        } else if (source == b6) {
            textField.setText(textField.getText() + "6");
        } else if (source == b7) {
            textField.setText(textField.getText() + "7");
        } else if (source == b8) {
            textField.setText(textField.getText() + "8");
        } else if (source == b9) {
            textField.setText(textField.getText() + "9");
        } else if (source == dot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == plus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == minus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == mul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == div) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;

        } else if (source == equal) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;

            }
        }


    }
}

