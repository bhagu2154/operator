package operator;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int num= scanner.nextInt();{
            for( int i=1;i<=num/2;i++)
            {
                if(num%i==0){
            System.out.println(i +"is factor of"+num);
        }

    }
}}}
