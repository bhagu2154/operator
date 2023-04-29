package operator;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the product quantity");
        int  quantity = scanner.nextInt();
        System.out.println("enter the product price");
        int  productprice = scanner.nextInt();
        int billamount=productprice * quantity;
        float finalbillamount=0;
        if(billamount>1000)
         {
             finalbillamount= (float) (billamount-billamount * 0.1);
         }
        else {
            finalbillamount=billamount;
        }
        System.out.println("bill amunt="+finalbillamount);

    }
}

