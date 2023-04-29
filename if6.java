package operator;

import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age of person1");
        int person1 = sc.nextInt();
        System.out.print("enter age of person2");
        int person2 = sc.nextInt();
        System.out.print("enter age of person3");
        int person3 = sc.nextInt();
        int oldest ;
        int youngest;
//oldest
        if (person1 > person2 && person1 > person3) {
            oldest = person1;
        } else if (person2 > person1 && person2 > person3) {
            oldest = person2;
        } else {
            oldest = person3;
        }
        //youngest
        if (person1 < person2 && person1 < person3) {
            youngest = person1;
        } else if (person2 < person1 && person2 < person3) {
            youngest = person2;
        } else {
            youngest = person3;
        }
            System.out.println("oldest age is=" + oldest);
            System.out.println("youngest age is=" + youngest);
        }
    }

