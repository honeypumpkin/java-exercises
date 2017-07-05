package exercises;

import java.util.ArrayList;

/**
 * Created by robin on 6/30/17.
 */
public class fiveLetters {
    public static void main(String[] args){

        ArrayList<String> word = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        word.add("away");
        word.add("where");
        word.add("yellow");
        word.add("three");
        int length = word.size();
        int sum = 0;
        for (String i : word) {
            if (i.length() == 5){
                newList.add(i);

            }
            System.out.print(newList);

        }


    }
}
