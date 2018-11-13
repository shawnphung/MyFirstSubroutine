/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tempconverter;
import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class TempConverter {
    public static void FahrenheitToCelcius (){
       double fTemp, cTemp;
       Scanner input = new Scanner (System.in);
       
       System.out.println ("Enter a Fahrenheit Temperature: ");
       fTemp = input.nextDouble();
       
       cTemp = (double)5 / (double)9 * (fTemp - 32);
       System.out.println ("The Celcius temperature is: " + cTemp);
       
    }
  
    public static void main(String[] args) {
        FahrenheitToCelcius();
    }
    
}
