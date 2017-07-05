package exercises;

import java.util.Scanner;

/**
 * Created by robin on 6/28/17.
 */
public class inputOutput {
    public static void main(String[] args) {
        String name;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.next();
        System.out.println("Hello, " + name);

    }

}


/*public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}*/