package operator;

import java.util.Scanner;

public class lo1 {
    public static void main(String[] args) {
       int sum=0;float avg=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter 10 value");
        int  num= scanner.nextInt();
        for( int i=1;i<=10;i++)
            sum=sum+i;
        avg=sum / 10;
        System.out.println(avg);
    }
}
