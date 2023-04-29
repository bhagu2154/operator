package operator;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choice");
        int marks = scanner.nextInt();
        char grade = 0;
        if (marks < 25) {
            grade = 'f';
        } else if (marks >= 25 && marks < 45) {
            grade = 'E';
        } else if (marks >= 45 && marks < 50) {
            grade = 'D';
        } else if (marks >= 50 && marks <60) {
            grade = 'c';
        } else if (marks >= 60 && marks <80)
            grade='B';
             if (marks >= 80) {
                grade = 'A';
            }
             System.out.println(" your score is="+marks+"\t"+"grade is="+grade);
        }
    }
