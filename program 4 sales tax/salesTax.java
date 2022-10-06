// sara kendig 
// this program calculates the sales and local tax in pennsylvania 
// and gives the final sales for the month

import java.util.Scanner;       //import scanner class

public class salesTax {
    public static void main(String[] args){
        double sales;
        double stateTax = .0307;
        double localTax = .06;
        double stateFinal;           // final state total
        double localFinal;           // final local total
        double finalSales;           // finals sales

        // scanner object
        Scanner keyboard = new Scanner(System.in);

        // get sales
        System.out.println("Please enter first value: ");

        sales = keyboard.nextDouble();

        // calculate tax

        stateFinal = stateTax * sales;

        localFinal = localTax * sales;

        finalSales = stateFinal + localFinal + sales;

        // display
        System.out.println("The total sales for the month is $" + sales);
        System.out.println("The state tax for the month is $" + stateFinal);
        System.out.println("The local tax for the month is $" + localFinal);
        System.out.println("The total sales plus tax for the month is $" + finalSales);


    }
}