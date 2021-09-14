package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.println( "What is your height in inches? " );
        String height = reader.nextLine();

        System.out.println( "Whats your weight in pounds?" );
        String weight = reader.nextLine();

        float h = Float.parseFloat(height);
        float w = Float.parseFloat(weight);

        float bmi = (float) ((w / (h * h)) * 703);

        System.out.printf("Your BMI is %.1f.", bmi);

        if (18.5 < bmi && bmi < 25) {
            System.out.println( "You are within the ideal weight range." );
        }
        else if (bmi <= 18.5) {
            System.out.println( "You are underweight . You should see your doctor." );
        }
        else if (bmi >= 25) {
            System.out.println( "You are overweight . You should see your doctor." );
        }
    }
}