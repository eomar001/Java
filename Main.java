package com.example.java;
import java.util.Scanner;
public class Calculator1 {
        public static void main(String[]args){
        String s1 = getInput("input first number:");
        String s2 = getInput("input second number:");
        String op = getInput("choose an operation + * - /");
        double result =0;
        try {
            switch (Op){
                case "+":
                    result= addValues(s1,s2);
                    break;
                case "-":
                    result= subtractValues(s1,s2);
                    break;
                case"*":
                    result= multiplyValues(s1,s1);
                    break;
                case"/":
                    result= devideValues(s1,s1);
                    break;
                default:
                    System.out.println("Unrecognized operation!:");
                    break;





            }



        }
    }

}

