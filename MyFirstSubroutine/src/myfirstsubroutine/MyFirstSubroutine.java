/*
 * Shawn Phung
 * November 13, 2018
 * Present the user with multiple options. Each option will perform a method.
 */

package myfirstsubroutine;
import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class MyFirstSubroutine {
//Creating methods
    public static void addAndOut (int n1, int n2){
        int sum = n1 + n2;
        System.out.println ("The sum is " + sum);
    }
    public static void subAndOut (int n1, int n2){
        int dif = n1 - n2;
        System.out.println ("The difference is " + dif);
    }
    public static void multAndOut (int n1, int n2){
        int prod = n1 * n2;
        System.out.println ("The product is " + prod);
    }
    public static void divAndOut (int n1, int n2){
        int quot = n1 / n2;
        System.out.println ("The quotient is " + quot);
    }
    public static void hypAndOut (double n1, double n2){
        double hyp = Math.hypot (n1,n2);
        System.out.println ("The hypotenuse is " + hyp);
    }
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        //Variable Declaration
        int choice;
        
        //Input & Output Area
        System.out.println ("My First Subroutine Program");
        System.out.println ("");
        
        do{
        //Prompting Options
        System.out.println("Please pick an option");
        System.out.println("1...Find the sum of two numbers");
        System.out.println("2...Find the difference of two numbers");
        System.out.println("3...Find the product of two numbers");
        System.out.println("4...Find the quotient of two numbers");
        System.out.println("5...Find the hypotenuse of two sides");
        System.out.println("6...End program");
        System.out.println("-----------------------------------------------------");
        
        choice = keyedInput.nextInt();
        
        if(choice == 1){
           System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           addAndOut(num1,num2);
        }
        else if(choice == 2){
             System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           subAndOut(num1,num2);
        }
        else if(choice == 3){
             System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           multAndOut(num1,num2);
        }
        else if(choice == 4){
           System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           divAndOut(num1,num2);
        }
        else if(choice == 5){
           System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           hypAndOut(num1,num2);
        }
        else if(choice == 6){
            System.out.println ("You have chosen to end the program");
            System.out.println ("Thank you and goodbye");
        }
       
       }
     while (choice != 6);
    }
 
}

