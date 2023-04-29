package operator;

import java.util.Scanner;

public class ft {
    public static void main(String[] args) {
        int fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int n= scanner.nextInt();
        for( int i=1;i<=n;i++)
        fact=fact*i;
        System.out.println("fact is="+fact);
    }
}
