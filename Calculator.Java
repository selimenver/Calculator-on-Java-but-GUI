package com.example;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double result;
       Scanner reader = new Scanner(System.in);

       double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number."));
       double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number."));
       String op = JOptionPane.showInputDialog("Enter your operator. Available operators: +,-,*,/");

       switch (op){
           case "+":
               result = num1+num2;
               JOptionPane.showMessageDialog(null,"Your result is: " + result);
               break;
           case "-":
               result = num1-num2;
               JOptionPane.showMessageDialog(null,"Your result is: " + result);
               break;
           case "*":
               result = num1*num2;
               JOptionPane.showMessageDialog(null,"Your result is: " + result);
               break;
           case "/":
               if (num2 == 0){
                   JOptionPane.showMessageDialog(null,"You cannot divide by zero.");
               }
               else{
                   result = num1/num2;
                   JOptionPane.showMessageDialog(null,"Your result is: " + result);
               }
               break;

       }

    }
}
