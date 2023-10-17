package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        if (n == 0) System.out.println("Oh, it looks like there is no one here");
        else if (n < 0) System.out.println("Seriously? Why so negative?");
        else {
            for (int i = 0; i < n; i++) {
                System.out.printf("Hello, %s\n", in.nextLine());
            }
        }
    }
}
