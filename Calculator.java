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
        if (input.length() == 0) { // this command first checks if the user input is only 1 character long, it will
                                   // send an error as no calculation will be possible with that
            return "Error, Input missing";
        }

        // handle special operations such as sin and cosine etc.
        if (input.startsWith("s") || input.startsWith("v") || input.startsWith("t") || input.startsWith("s")
                || input.startsWith("~") || input.startsWith("c") || input.startsWith("|")) {

            return CalculateSpecial(input); // this is another method being called here which actually does the
                                            // calculation and returns the statement back here
        }

        // handle simple operations
        return CalculateSimple(input); // this is also another method being called if the previous "if" statemnt was
                                       // not used, then this method will return the answer
    }

    // Handle special operators based calucations
    public static String CalculateSpecial(String input) { // this method will only be able to return in String Variable
        Scanner moreScan = new Scanner(input); // the new scanner moreScan just reads first thing of the input from user
        String specialOptr = moreScan.next(); // next scanner will look for the operator type

        if (specialOptr.length() != 1) { // here it will send an error if the operator is longer than 1 character
            return "Error, Only Single letter Operator";

        }
        if (input.length() == 1) { // here it will send out an error if the entire input string is just 1 string
            return "Error, First string is longer than 1";

        }

        if (!moreScan.hasNextDouble()) { // it will check if there is another double after the operator variable, if
                                         // there is no Double type variable after the optr, it will send out an error
            return "Error, Double missing";
        }

        Double y = moreScan.nextDouble(); // here it is just saving the double after the operator in a variable called y
        return moreCalc(y, specialOptr.charAt(0)); // here it is calling on another method to actually perform the
                                                   // calculations

    }

    public static String CalculateSimple(String input) { // calculation for simpler operations
        Scanner strCalculation = new Scanner(input); // reads the input

        if (!strCalculation.hasNextDouble()) { // if there are no doubles , it sends an error
            return "Error: missing double";
        }
        double num1 = strCalculation.nextDouble();
        if (!strCalculation.hasNext()) { // if there is no operator after 1st double, it sends an error
            return "Error: missing operator";
        }
        String optr = strCalculation.next();
        if (optr.length() != 1) { // if the operator length is longer than 1 character then it will send an error
            return "Error: invalid operator: " + optr;
        }
        char optrC = optr.charAt(0);
        if (optrC != '+' && optrC != '-' && optrC != '*' && optrC != '%' && optrC != '/' && optrC != '^'
                && optrC != '^') { // these are all the symbols for the calculations and if the operator is not one
                                   // of these it will send an error
            return "Error, Invalid OPerator: " + optrC;
        }
        if (!strCalculation.hasNextDouble()) { // if there is no double afteer operator it will send out an error
            return "Error, Invalid 2nd variable";
        }
        double num2 = strCalculation.nextDouble();
        return Calc(num1, optrC, num2); // this calls upon another method which actually does the calculations
    }

    public static String Calc(double var1, double optr, double var2) { // here is the list of all the simple operations
                                                                       // which calc can do
        if (optr == '%') {
            return "" + (var1 % var2); // modulo
        } else if (optr == '+') {
            return "" + (var1 + var2); // addition
        } else if (optr == '/') {
            return "" + (var1 / var2); // division
        } else if (optr == '*') {
            return "" + (var1 * var2); // multiplication
        } else if (optr == '^') {
            return "" + (Math.pow(var1, var2)); // power of
        } else if (optr == '-') {
            return "" + (var1 - var2); // subtraction
        } else {
            return "Error, Invalid optr: " + optr; // if its none of them it will send an error
        }
    }

    public static String moreCalc(double var3, char optr) { // here is the list of all the complicated operations
                                                            // possible
        if (optr == 'v') {
            return "" + Math.sqrt(var3); // squareroot of a number
        } else if (optr == 'c') {
            return "" + Math.cos(var3); // cosine of a angle degree
        } else if (optr == 't') {
            return "" + Math.tan(var3); // tangent of a angle degree
        } else if (optr == 's') {
            return "" + Math.sin(var3); // sine of a angle degree
        } else if (optr == '|') {
            return "" + Math.abs(var3); // absolute value of a number
        } else if (optr == '~') {
            return "" + Math.round(var3); // round off to the nearest integer
        } else {
            return "Error, invalid optr: " + optr; // if the operation is neither of these all it will send an error
        }
    }
}
