/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_project;

import java.util.*;

import javax.sound.sampled.SourceDataLine;

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
        System.out.println("Hello, Welcome to Aman's Bang Calculator\n"); // welcome message
        startCalc();
        System.out.println("Thanks for coming fam"); // closing message
    }

    public static void startCalc() { // This is the entire structure of my calculator
        // first ask for input

        while (true) {
            Scanner scanInput = new Scanner(System.in); // makes a scanner
            System.out.println("Please enter an expression kind sir/ ma'dam:"); // generic statement asking user for an
                                                                                // expression
            String input = scanInput.nextLine(); // Makes the user input an expression and then stores it in a variable
            if (input.equalsIgnoreCase("quit")) // if statement checks whether if the expression by user is "quit" in
                                                // any capitalization, it will break the while loop and print ending
                                                // message
                break;
            String output = Calculate(input); // here, the user input is being sent to a method called "Calculate()" and
                                              // after that method runs, the output would be stored in output variable
            System.out.println(output); // here in the end, after the calculations happen, the final answer is printed
        }
    }

    public static String Calculate(String input) {
        if (input.length() == 0) {
            return "Error, Input missing";
        }

        // handle special operations
        if (input.startsWith("s") || input.startsWith("v") || input.startsWith("t") || input.startsWith("s")
                || input.startsWith("~") || input.startsWith("c") || input.startsWith("|")) {

            return CalculateSpecial(input);
        }

        // handle simple operations
        return CalculateSimple(input);
    }

    // Handle special operators based calucations
    public static String CalculateSpecial(String input) {
        Scanner moreScan = new Scanner(input);
        String specialOptr = moreScan.next();

        if (specialOptr.length() != 1) {
            return "Error, Only Single letter Operator";

        }
        if (input.length() == 1) {
            return "Error, First string is longer than 1";

        }

        if (!moreScan.hasNextDouble()) {
            return "Error, Double missing";
        }

        Double y = moreScan.nextDouble();
        return moreCalc(y, specialOptr.charAt(0));

    }

    public static String CalculateSimple(String input) {
        Scanner strCalculation = new Scanner(input);

        if (!strCalculation.hasNextDouble()) {
            return "Error: missing double";
        }
        double num1 = strCalculation.nextDouble();
        if (!strCalculation.hasNext()) {
            return "Error: missing operator";
        }
        String optr = strCalculation.next();
        if (optr.length() != 1) {
            return "Error: invalid operator: " + optr;
        }
        char optrC = optr.charAt(0);
        if (optrC != '+' && optrC != '-' && optrC != '*' && optrC != '%' && optrC != '/' && optrC != '^'
                && optrC != '^') {
            return "Error, Invalid OPerator: " + optrC;
        }
        if (!strCalculation.hasNextDouble()) {
            return "Error, Invalid 2nd variable";
        }
        double num2 = strCalculation.nextDouble();
        return Calc(num1, optrC, num2);
    }

    public static String Calc(double var1, double optr, double var2) {
        if (optr == '%') {
            return "" + (var1 % var2);
        } else if (optr == '+') {
            return "" + (var1 + var2);
        } else if (optr == '/') {
            return "" + (var1 / var2);
        } else if (optr == '*') {
            return "" + (var1 * var2);
        } else if (optr == '^') {
            return "" + (Math.pow(var1, var2));
        } else if (optr == '-') {
            return "" + (var1 - var2);
        } else {
            return "Error, Invalid optr: " + optr;
        }
    }

    public static String moreCalc(double var3, char optr) {
        if (optr == 'v') {
            return "" + Math.sqrt(var3);
        } else if (optr == 'c') {
            return "" + Math.cos(var3);
        } else if (optr == 't') {
            return "" + Math.tan(var3);
        } else if (optr == 's') {
            return "" + Math.sin(var3);
        } else if (optr == '|') {
            return "" + Math.abs(var3);
        } else if (optr == '~') {
            return "" + Math.round(var3);
        } else {
            return "Error, invalid optr: " + optr;
        }
    }
}
