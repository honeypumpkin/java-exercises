package studios;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by robin on 7/5/17.
 */
public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        int len = myString.length();
        HashMap<Character, Integer> numChars = new HashMap<>();

        for (int i = 0; i < len; ++i) {
            char charAt = myString.toLowerCase().charAt(i); //note you have to add .toLowerCase within a method - just adding as a variable deceleration does not work.
            if (!numChars.containsKey(charAt)) {
                numChars.put(charAt, 1);
            } else {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }
//        This prints as a list {...,...}
//        System.out.println(numChars);


        for (Map.Entry<Character, Integer> numChar : numChars.entrySet()) {
            System.out.println(numChar.getKey() + ": " + numChar.getValue());
        }
    }
}
