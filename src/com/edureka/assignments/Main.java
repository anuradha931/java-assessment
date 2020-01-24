package com.edureka.assignments;//import java.io.*;
import com.edureka.assignments;
class Main{
    private static int digitsManipulations(int n) {
        //String s= Integer.toString(n);
        int intProduct=1,intAdd=0;

        while(n!=0){
            intAdd=intAdd+n%10;
            intProduct=intProduct*(n%10);
            n=n/10;
        }

        System.out.println("intProduct==="+intProduct);
        System.out.println("intAdd==="+intAdd);
        return intProduct-intAdd;
    }

    public static void main(String[] args){
        int n=1010;

        System.out.println(digitsManipulations(n));
    }


}
