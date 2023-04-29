package operator;

import java.util.Scanner;

public class calender {
    public static void main(String[] args) { //int year=0;
        int sum=0;int date;int monthcode; int leapyear;
        System.out.println("enter day& year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day= scanner.nextInt();{
                sum=(day+year+year/4)/7;
                        if(day==sum)
            {
                System.out.println("sunday");
            } else if (day==1) {
                System.out.println("monday");
            }
        }
        {
        if (year%400==0||(year% 4==0 )&&(year %100!= 0)){
          /*  if(day==0){
                System.out.println("sunday");}
            else if (day==1) {
                System.out.println("monday");}*/

            System.out.println("leap");}
         else{
            System.out.println("not leap");}
    }
}}