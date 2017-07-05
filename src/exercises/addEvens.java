package exercises;

import java.util.ArrayList;

/**
 * Created by robin on 6/30/17.
 */
public class addEvens {
    public static void main(String[] args){

        ArrayList<Integer> someInts = new ArrayList<>();
        someInts.add(1);
        someInts.add(2);
        someInts.add(3);
        someInts.add(4);
        someInts.add(5);
        someInts.add(6);
        someInts.add(7);
        someInts.add(8);
        someInts.add(9);
        someInts.add(10);
        int sum = 0;

        for (int i : someInts) {
            if (i % 2 != 0){
                sum += i;
                System.out.println(sum);
            }

        }


    }
}



