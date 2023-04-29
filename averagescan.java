package operator;

import java.util.Scanner;

public class averagescan {
        void calculate(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter any three number");
            int number1= scanner.nextInt();
            int number2= scanner.nextInt();
            int number3= scanner.nextInt();
            float calu= (float)(number1+number2+number3)/3;
            System.out.println("operator.average of three number="+calu );
    }

    public static void main(String[] args) {
        averagescan aver = new averagescan();
        aver.calculate();
    }
}