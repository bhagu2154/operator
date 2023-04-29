package operator;

import java.util.*;

public class if4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your salary");
        int salary = scanner.nextInt();
        System.out.println("enter your year service");
        int serduration= scanner.nextInt();
        float bonusamount=0.0f;
        if (serduration > 5)
        {
            bonusamount = salary * 0.5f;
        }
System.out.println("your bonus amount is="+bonusamount);
    }
}
