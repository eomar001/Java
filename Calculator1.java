package com.example.java;
import java.util.Scanner;
public class Calculator1 {
        public static void main(String[]args) {
            String s1 = getInput("input first number:");
            String s2 = getInput("input second number:");
            String op = getInput("choose an operation + * - /");
            double result = 0;
            try {
                switch (Op) {
                    case "+":
                        result = addValues(s1, s2);
                        break;
                    case "-":
                        result = subtractValues(s1, s2);
                        break;
                    case "*":
                        result = multiplyValues(s1, s1);
                        break;
                    case "/":
                        result = devideValues(s1, s1);
                        break;
                    default:
                        System.out.println("Unrecognized operation!:");
                        break;
                }
                System.out.println("The answer is " + result);
            } catch (Exception e) {
                System.out.println("number formatting exceptions " + e.getMessage());
            }
        }


        private static double addValues(String s1, String s2) {
             double d1 = Double.parseDouble(s1);
             double d2 = Double.parseDouble(s2);
             return d1 + d2;
         }
         private static double subtractValues(String s1, String s2) {
         double d1 = Double.parseDouble(s1);
         double d2 = Double.parseDouble(s2);
         return d1 - d2;}
         private static double multiplyValues(String s1, String s2) {
                 double d1 = Double.parseDouble(s1);
                 double d2 = Double.parseDouble(s2);
                 return d1 * d2;}
                 private static double devideValues(String s1, String s2) {
          double d1 = Double.parseDouble(s1);
          double d2 = Double.parseDouble(s2);
          return d1 / d2;}
    }


