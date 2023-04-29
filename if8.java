package operator;

import java.util.Scanner;

public class if8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.println("how many held classes");
         int holdclases = scanner.nextInt();
        System.out.println("how many attended classes");
        int attendclasses= scanner.nextInt();
       double per=(attendclasses*100)/holdclases;{
        System.out.println("total per of this student="+per);
       }
       if (per < 75){
        System.out.println(" student sit not allowed for exam " );}
         else {
        System.out.println(" student sit allowed for the exam ");
    }
}}
