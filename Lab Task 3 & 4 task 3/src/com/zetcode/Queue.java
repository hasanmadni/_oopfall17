package com.zetcode;

public class Queue {
    private char q[]; //this array holds the queue
    private int putloc=-1, getloc=0; //the put and get indices

    public Queue (int size) {
        q = new char[size]; //allocate memory for queue
    }
    public Queue( Queue k){
        q = k.q;
    }
    public Queue( char[] x){
        q = new char[x.length];
        for ( int i = 0; i < q.length; i++){
            q[i] = x[i];
            putloc++;
        }

    }
    public void get() throws def{
        if(getloc > putloc) throw
        new def("The queue is empty");
            System.out.println(q[putloc]);;}

    public void put (char ch) throws abc {
        if (putloc==q.length-1) throw
            new abc("The queue has reached it's capacity");
            putloc++;
            q[putloc] = ch;}
    }


class def extends Exception {

   def(String errorMessage) {
        super(errorMessage);
    }
}

class abc extends Exception {

    abc(String errorMessage) {
        super(errorMessage);
    }
}


