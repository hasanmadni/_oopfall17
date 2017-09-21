package com.zetcode;
import java.util.*;
public class QueueDemo {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Queue mt = new Queue(10);
       /*
       We cannot directly enter 100 as array is a private memeber and the only way to access it is through encapsulation.
        */
       // mt.q[0] = 100;
        System.out.println("Enter The charachter you want to add");
        mt.put(in.next().charAt(0));

        mt.get();
        /*
        Value of 100 cannot be inserted as It is a char array adn we cannot insert a number.
         */

    }
}
