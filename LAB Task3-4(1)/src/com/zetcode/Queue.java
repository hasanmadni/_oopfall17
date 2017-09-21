package com.zetcode;
import java.util.*;
public class Queue {
    Scanner in = new Scanner(System.in);
    int sizeofqueue;


    private char q[]; //this array holds the queue
    private int putloc=-1, getloc=0; //the put and get indices

    public Queue (int size) {
        q = new char[size]; //allocate memory for queue
    }

    public void get() {
        if(getloc > putloc) {
            System.out.println(" - Queue is empty.");
        }
        else{

            System.out.println(q[putloc]);;}
    }
    public void put (char ch) {
        if (putloc==q.length-1) {
            System.out.println (" Queue has reached it's capacity.");
        }
        else{
        putloc++;
        q[putloc] = ch;}
    }
}

