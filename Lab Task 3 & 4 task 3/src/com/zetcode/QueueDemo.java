package com.zetcode;

public class QueueDemo {

    public static void main(String[] args) throws def {

	/*
	Queue envoked with the size of array
	 */
            Queue q1 = new Queue(10);
     /*
	Queue envoked with the object of type queue
	 */
            Queue q2 = new Queue(q1);
            char[] k = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
	/*
	Queue envoked with the char array
	 */
            Queue q3 = new Queue(k);
         q1.get();


        }
    }


