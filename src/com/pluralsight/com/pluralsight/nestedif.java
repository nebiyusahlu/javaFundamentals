package com.pluralsight.com.pluralsight;

public class nestedif {

    public static void main(String[] args) {

        float students = 10.0f;
        float rooms = 40.0f;

        if (students > 0.0f) {
            if (rooms <= 0) {
                System.out.println("No room");
            }

            System.out.println(students / rooms);
        }
        else
            System.out.println("No Students");

        System.out.println();
        System.out.println("** end program **" );
    }
}
