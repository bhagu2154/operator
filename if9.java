package operator;

import java.util.*;
 public class if9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("held class");
        int heldclass = scanner.nextInt();
        System.out.println("attendedclass class");
            int attendedclass = scanner.nextInt();
            double per = (attendedclass * 100)/heldclass;{
            System.out.println("percentage of attended classes is =" +per);}
        int medicalcause = scanner.nextInt();
              if (per < 75 && per > medicalcause) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }}


