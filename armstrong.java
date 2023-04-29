package operator;

import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");{
            int number= scanner.nextInt();
            int onumber=number;
            int sum=0;
            while(number>0){
                int lastdigit=number%10;
                sum=sum+lastdigit*lastdigit*lastdigit;
                number=number/10;
            }
            System.out.println(sum==onumber ? "operator.armstrong":"not operator.armstrong");
        }}}