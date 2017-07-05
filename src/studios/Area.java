package studios;

import java.util.Scanner;

/**
 * Created by robin on 6/28/17.
 */
public class Area {
    public static void main(String[] args) {
        Double radius;
        Double area;
        Double pi = 3.14;
        Scanner inRadius;

        inRadius = new Scanner(System.in);
        System.out.println("Give me a number");
        radius = inRadius.nextDouble();

        area = pi * radius * radius;
        System.out.println("The area of the circle is " + area);

    }
}
