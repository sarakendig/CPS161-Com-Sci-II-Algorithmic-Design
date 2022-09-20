// This program will input the value of two sides of a right triangle and then
// determine the size of the hypotenuse.
// Sara Kendig

import java.util.Scanner;    //import scanner class

public class RightTrig {
    public static void main(String[] args){
        double a;              // side a
        double b;              // side b
        double hyp;            // hypotenuse
        

        Scanner keyboard = new Scanner(System.in);     // create a scanner object

        // get side a
        System.out.println("Please enter first value: ");

        a = keyboard.nextDouble();

        // get side b
        System.out.println("Please enter second value: ");

        b = keyboard.nextDouble();

        // calculate hypotenuse
        hyp = Math.sqrt((a*a)+(b*b));

        // display results
        System.out.println("The sides of the right triangle are " + a + " and " + b);

        System.out.println("The hypotenuse is " + hyp);

        
    }
}
