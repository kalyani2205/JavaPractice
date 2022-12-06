package Methods;

public class StaticMethodDemo3
{
 static int num1 =100;
static int num2=20;
    static int add(int num1 ,int num2)
    {
        return (num1/num2);

    }
    public static void main(String[] args)

    {
        System.out.println("divide   = "+ StaticMethodDemo3.add(10,1) );
    }
}
