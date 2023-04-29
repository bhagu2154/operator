package operator;

public class A {
    int add(int a, int b) {
        System.out.println("Frm class operator.A");
        return a+b;
    }

    public static void main(String[] args) {
        A d = new B();
        {
            System.out.println(d.add(10, 20));
            System.out.println(d.add(20, 10));
        }
    }
}
class B extends A {
    int add(int a, int b) {
        System.out.println("from class operator.B");
        return a + b;
    }
}


