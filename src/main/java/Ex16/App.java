package Ex16;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int Uage = input.nextInt();
        int Lage = 16;

        final String msg = Uage >= Lage
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
        System.out.println(msg);
    }
}
