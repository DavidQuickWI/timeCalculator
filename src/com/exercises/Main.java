package com.exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] time1 = new int[2];
        int[] time2 = new int[2];

        System.out.println("Please enter the first time: ");
        String timeInput = sc.nextLine();
        String[] time = timeInput.split(":");

        try{
            time1[0] = Integer.parseInt(time[0]);
            time1[1] = Integer.parseInt(time[1]);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid time entered");
        }

        System.out.println("Please enter the second time: ");
        timeInput = sc.nextLine();
        time = timeInput.split(":");
        try{
            time2[0] = Integer.parseInt(time[0]);
            time2[1] = Integer.parseInt(time[1]);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid time entered");
        }

        int[] calculatedTime = new int[2];

        if(time1[0] - 1 == time2[0] || time1[0] + 1 == time2[0]){
            calculatedTime[0] = 0;
            calculatedTime[1] = time1[1] - time2[1];
        }else if(time1[0] > time2[0]){
            calculatedTime[0] = time1[0] - time2[0];
            calculatedTime[1] = time1[1] - time2[1];
        } else {
            calculatedTime[0] = time2[0] - time1[0];
            calculatedTime[1] = time2[1] - time1[1];
        }

        if(calculatedTime[1] < 0)
            calculatedTime[1] += 60;

        String minutes = "" + calculatedTime[1];

        if(calculatedTime[1] < 10)
            minutes = "0" + calculatedTime[1];
        System.out.printf("%d:%s", calculatedTime[0], minutes);
    }
}
