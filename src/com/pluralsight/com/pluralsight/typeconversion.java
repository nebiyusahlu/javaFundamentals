package com.pluralsight.com.pluralsight;

public class typeconversion {

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal =5;


        short result1 = (short) byteVal;
        short result2 = (short) (byteVal - longVal);


        System.out.println("Success");
    }
}
