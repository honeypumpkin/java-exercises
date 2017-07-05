package exercises;

import java.util.Scanner;

/**
 * Created by robin on 6/28/17.
 */
public class area {
    public static void main(String[] args) {
        Double width;
        Double length;
        Double area;
        Scanner inLength;
        Scanner inWidth;

        inLength = new Scanner(System.in);
        System.out.println("What is your length?");
        length = inLength.nextDouble();

        inWidth = new Scanner(System.in);
        System.out.println("What is your width");
        width = inWidth.nextDouble();

        area = width * length;

        System.out.println("Your area is " + area);
    }
}

