package operator;

import java.util.Scanner;

public class gcdorhcf {
    public static void main(String[] args) {
        int gcd=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two value");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        for( int i=1;i<=a;i++)
        {
            if(a%i==0&&b%i==0){
                gcd=i;
            }
            System.out.println("gcd is"+gcd);
        }
        {

    }
}}
