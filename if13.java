package operator;

import java.util.Scanner;

public class if13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter age,gender,marital status");
        int age=scanner.nextInt();
        char gender=scanner.next().charAt(0);
        char maritalstatus =  scanner.next().charAt(0);
        if(gender=='f') {
            System.out.println("gender"+gender+"\t she is working in urbon");
        }
        else if(gender=='m'&& (age>20 && age<40))
        {
            System.out.println("gender"+gender+ "\t he may work in anywhere");

        } else if (gender=='m'&&(age>40&&age<60)) {
            System.out.println("gender" + gender + "he will work on urbon area only");
        }else
        {
            System.out.println("error");
        }
        }


    }

