/*
 * Shawn Phung
 * Oct 26, 2018
 * To get a number from the user and find the value squared, cubed, or to any power.
 */
package exponentprogram;

import java.util.Scanner;

/**
 *
 * @author shphu0697
 */
public class ExponentProgram {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        // Variable Declaration Area
        int choice;
        int exp;
        int userNum;
        int num = 1;

        //Input/Output Area
        System.out.println("Exponent Program");
        System.out.println("");

            do{
        System.out.println("Please enter your choice:");
        System.out.println("1... Find the value of a number squared");
        System.out.println("2... Find the value of a number cubed");
        System.out.println("3... Find the value of a number to any power");
        System.out.println("4... End program");
        System.out.println("-------------------------------------------------");

        choice = keyedInput.nextInt();
        
        if (choice == 1) {
            System.out.println("You have chosen to find the value of a number squared");
            System.out.println("Please enter a value");

            userNum = keyedInput.nextInt();

            //Checking to see if i = exponent
            for (int i = 1; i < 2; i++) {

                userNum = userNum * userNum;
            }
            System.out.println("The value of your desired number squared is: " + userNum);
            System.out.println("-------------------------------------------------");

        } else if (choice == 2) {
            System.out.println("You have chosen to find the value of a number cubed");
            System.out.println("Please enter a value");

            userNum = keyedInput.nextInt();

            //Checking to see if i = exponent
            for (int i = 0; i < 3; i++) {

                num *= userNum;
            }
            System.out.println("The value of your number cubed is:" + num);
            System.out.println("-------------------------------------------------");

        } else if (choice == 3) {
            System.out.println("You have chosen to find the value of a number to any power");
            System.out.println("Please enter a base number");

            userNum = keyedInput.nextInt();

            System.out.println("Please enter the value of the exponent");
            exp = keyedInput.nextInt();

            //Checking to see if i = exponent
            for (int i = 0; i < exp; i++) {
                num *= userNum;
            }
            System.out.println("The value of your number to the power of " + exp + " is: " + num);
            System.out.println("-------------------------------------------------");
        }
        else if(choice == 4){
            System.out.println("Thank you for using the program");
            System.out.println("-------------------------------------------------");
        }
    }
            while (choice != 4);
    }
}
            


