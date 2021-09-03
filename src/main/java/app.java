/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Calendar;
import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        System.out.println("Enter your age!");

        Scanner scan = new Scanner(System.in);
        String ageNow = scan.next();

        System.out.println("At what age do you want to retire?");

        scan = new Scanner(System.in);
        String ageLater = scan.next();

        int time = Integer.parseInt(ageLater) - Integer.parseInt(ageNow);
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println(String.format("You will retire in %d years! It's %d, and you can retire in %d!", time, year, year + time));
    }
}
