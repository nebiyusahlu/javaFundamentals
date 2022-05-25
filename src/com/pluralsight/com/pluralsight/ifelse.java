package com.pluralsight.com.pluralsight;

public class ifelse {
    public static void main(String[] args) {


        int v1 = 40;
        int v2 = 10;
        int diff = 0;

        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger");
            System.out.println(diff);
        }
        else if (v2 > v1) {
            diff = v2 - v1;
            System.out.println("v2 is bigger");
            System.out.println(diff);
        }

    }

}
