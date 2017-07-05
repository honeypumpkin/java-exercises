package exercises;

import java.util.Scanner;

/**
 * Created by robin on 6/28/17.
 */
public class milesPerGallon {
    public static void main(String[] args){
        Double miles;
        Double gallons;
        Scanner milesIn;
        Scanner gallonsIn;
        Double milesPerGallon;

        milesIn = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = milesIn.nextDouble();

        gallonsIn = new Scanner(System.in);
        System.out.println("How many gallons did you use?");
        gallons = gallonsIn.nextDouble();

        milesPerGallon = miles / gallons;
        System.out.println("Your miles-per-gallon is " + milesPerGallon);


    }
}
