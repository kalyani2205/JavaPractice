package constructor;

public class paramConstructorDemo3
{
    int a;
    int b;

    paramConstructorDemo3(int a ,int b)
    {
        this.a=a;
        this.b=b;

        System.out.println("Addition = " + (a+b));

    }

    public static void main(String[] args) {
        System.out.println("parameterized constructor");
        paramConstructorDemo3 ref=new paramConstructorDemo3(10,20);


    }
}
