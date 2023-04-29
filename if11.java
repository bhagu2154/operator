package operator;

import java.util.Scanner;

public class if11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        if (i % 400 == 0 ||i%4==0 && i%100 !=0)
        {
            System.out.println("year is leap");
        } else
        {
            System.out.println("year is not leap ");
        }
    }
}
