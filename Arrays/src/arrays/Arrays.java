/*
 * Shawn Phung
 * Nov 1, 2018
 * To find the average mark of the user. The program will keep resetting until the user chooses to exit the program. 
 */

package arrays;
import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //Variable Declaration Area
        int mark1;
        int mark2;
        int mark3;
        int mark4;
        int avg; 
        int choice; 
        int marksNumber = 4;
        
        System.out.println("Welcome to the average calcutor");
        
        do {
        System.out.println("Please choose 1 or 2");
        System.out.println("The program will keep on running until option 2 is chosen");
        System.out.println("1...Start Program");
        System.out.println("2...End Program");
        System.out.println("-----------------------------------------------------");
        
        choice = keyedInput.nextInt();

        if (choice == 1){        
        System.out.println("Please enter the mark of your first course (whole number");
        mark1 = keyedInput.nextInt();
        System.out.println("Please enter the mark of your second course (whole number");
        mark2 = keyedInput.nextInt();
        System.out.println("Please enter the mark of your third course (whole number");
        mark3 = keyedInput.nextInt();
        System.out.println("Please enter the mark of your fourth course (whole number");
        mark4 = keyedInput.nextInt();
        
        //Defining Array
        int marks [] = new int [4];
        marks [0] = mark1;
        marks [1] = mark2;
        marks [2] = mark3;
        marks [3] = mark4;
        
        avg = (marks[0] + marks[1] + marks[2] + marks[3]) / marksNumber;
        System.out.println("Your overall average is " + Math.round(avg));
        System.out.println("-----------------------------------------------------");
        
    }
        else if (choice ==2){
            System.out.println ("You have chosen to end the program");
            System.out.println ("Thank you and goodbye");
    }
        
        } while (choice != 2);
    }
}
        

