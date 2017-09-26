package com.example.admin.helloworld;

/**
 * Created by Admin on 9/26/2017.
 */

public class CodingTest {

    public static void main(String[] args) {
        //write function, take number
        //return "fizz" if divisable by 3
        //return "buzz" if divisible by 5
        //return "fizzbuzz" if divisibe by 3 and 5
        //else return number

        System.out.println( NumFun(3) );
        System.out.println( NumFun(5) );
        System.out.println( NumFun(15) );
        System.out.println( NumFun(2) );
        System.out.println( NumFun(30) );
        System.out.println( NumFun(90) );

        //Problem 2
        //Create a function to find duplcate strings in a list of strings and print them.
        String[] s = {
                "test",
                "bbb",
                "String",
                "bbb",
                "String"
        };

        FindDuplicate( s );

    }

    public static String NumFun( int x ) {
/*
        boolean div_by_three = false;
        boolean div_by_five = false;

        if( x%3 == 0 )
            div_by_three = true;
        if( x%5 == 0 )
            div_by_five = true;

        if( div_by_three && div_by_five )
            return "fizzbuzz";
        else if( div_by_three )
            return "fizz";
        else if (div_by_five)
            return "buzz";
        else
            return "" + x;
            */
        if( x%3 == 0 && x%5 == 0 )
            return "fizzbuzz";
        else if( x%3 == 0 )
            return "fizz";
        else if ( x%5 == 0 )
            return "buzz";
        else
            return "" + x;
    }

    public static void FindDuplicate( String[] arr ) {

        for( int i = 0; i < arr.length; i++ ) {
            String temp = arr[i];

            for( int j = i+1; j < arr.length; j++ ) {
                if ( temp.equals( arr[j] ) )
                    System.out.println( "#" + j + " " + temp );
            }
        }
    }
}
