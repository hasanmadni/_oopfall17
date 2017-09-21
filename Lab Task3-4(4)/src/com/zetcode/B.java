package com.zetcode;

public class B extends A{
    public B(int x){
        System.out.println("Constructing B");
        final int i= x;
    }
}
