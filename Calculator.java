/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_project;

import java.util.*;
import java.awt.*;

/**
 *
 * @author Aman Gupta
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Welcome message below
        System.out.println("Hello, Welcome to Aman's Bang Calculator\n");

        while (true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Give an Expression:");
            String line = keyboard.nextLine();

            // check condition
            if (line.startsWith("s") || line.startsWith("v") || line.startsWith("t") || line.startsWith("s")
                    || line.startsWith("~") || line.startsWith("c") || line.startsWith("|")) {
                Scanner moreScan = new Scanner(line);
                String specialOptr = moreScan.next();

                if (specialOptr.length() != 1) {
                    System.out.println("Error, Only Single letter Operator");
                    continue;
                }

                // hello aman again`
                Double y = moreScan.nextDouble();
                moreCalc(y, specialOptr.charAt(0));
                continue;
            }

            Scanner strCalculation = new Scanner(line);

            if (!strCalculation.hasNextDouble()) {
                String nxt = strCalculation.next();
                if (nxt.equalsIgnoreCase("quit")) {
                    break;
                }
                System.out.println("Error: missing double");
                continue;
            }

            double num1 = strCalculation.nextDouble();
            if (!strCalculation.hasNext()) {
                System.out.println("Error: missing operator");
                continue;
            }

            String optr = strCalculation.next();
            if (optr.length() != 1) {
                System.out.println("Error: invalid operator: " + optr);
                continue;
            }

            char optrC = optr.charAt(0);
            if (optrC != '+' && optrC != '-' && optrC != '*' && optrC != '%' && optrC != '/' && optrC != '^'
                    && optrC != '^') {
                System.out.println("Error, Invalid OPerator: " + optrC);
                continue;
            }

            if (!strCalculation.hasNextDouble()) {
                System.out.println("Error, Invalid 2nd variable");
                continue;
            }

            double num2 = strCalculation.nextDouble();
            Calc(num1, optrC, num2);
        }
        System.out.println("Thanks for coming");
    }
    

    public static void Calc(double var1, double optr, double var2) {

        double sum = var1 + var2;
        double product = var1 * var2;
        double subtraction = var1 - var2;
        double quotient = var1 / var2;
        double modulo = var1 % var2;
        double powerOf = Math.pow(var1, var2);

        if (optr == '%') {
            System.out.println(modulo);
        } else if (optr == '+') {
            System.out.println(sum);
        } else if (optr == '*') {
            System.out.println(product);
        } else if (optr == '^') {
            System.out.println(powerOf);
        } else if (optr == '-') {
            System.out.println(subtraction);
        } else {
            System.out.println("Error, try again buddy");
        }
    }

    public static void moreCalc(double var3, char optr) {
        if (optr == 'v') {
            System.out.println(Math.sqrt(var3));
        } else if (optr == 'c') {
            System.out.println(Math.cos(var3));
        } else if (optr == 't') {
            System.out.println(Math.tan(var3));
        } else if (optr == 's') {
            System.out.println(Math.sin(var3));
        } else if (optr == '|') {
            System.out.println(Math.abs(var3));
        } else if (optr == '~') {
            System.out.println(Math.round(var3));
        } else {
            System.out.println("Error buddy try again bibba");
        }
    }
}
