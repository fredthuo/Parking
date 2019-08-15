package com.company;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String placeOfBirth;
        String date;
        String time;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter Place of Birth: ");
        placeOfBirth = sc.nextLine();

        System.out.println("Enter Date of Birth: ");
        date = sc.nextLine();

        System.out.println("Enter time of Birth: ");
        time = sc.nextLine();
    }
}
