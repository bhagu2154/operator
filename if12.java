package operator;

import java.util.Scanner;

public class if12 {
    public static void main(String[] args) {
        int rev=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any four digit number");
         int n = scanner.nextInt();
        while (n> 0)
        {
        rev = n % 10;
        n = n/10;
        System.out.print(rev);
        }
}
}