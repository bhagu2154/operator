package operator;

public class constopractice {
   /* operator.constopractice(){//default constructor
       System.out.println("default constructor");
    }*/
    constopractice(int a,String name)//parameteraized con
    {
        System.out.println("parameterized constructor");
        System.out.println(a);
        System.out.println(name);

    }


    public static void main(String[] args) {
        constopractice constopractice=new constopractice( 3,"abcd");
    }
}