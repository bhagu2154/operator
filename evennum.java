package operator;

import java.util.Scanner;

public class evennum {
    public static void main(String[] args) {

       for (int i = 1; i <= 100; i++)
       //or// for(int i=2;i<=100;i=i+2)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }}
   /* public static void main(String[] args) {
        int s = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any value");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("even number");}
                    else
            {
                System.out.println("odd number");

            }
        }
    }

*/