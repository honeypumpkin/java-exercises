package exercises;

import java.util.Scanner;


/**
 * Created by robin on 6/28/17.
 */
public class alicesAdventure {
    public static void main(String[] args){
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Scanner searchIn;


        searchIn = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        searchTerm = searchIn.next();
       // searchTerm.equalsIgnoreCase(text);

        boolean isContains = text.contains(searchTerm);

        System.out.println(isContains);
    }
}
