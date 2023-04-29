package operator;

public class average {
    int num1;
    int num2;
    int num3;
    float aver() {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        average num=new average();
        num.num1=3;
        num.num2=5;
        num.num3=6;
        System.out.println("operator.average of number="+ num.aver());
    }
}
