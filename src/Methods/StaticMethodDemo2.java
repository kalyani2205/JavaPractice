package Methods;

public class StaticMethodDemo2
{
 static int num1 =100;
static int num2=20;
    static int add()
    {
        return (num1/num2);
    }
    public static void main(String[] args)
    {
        System.out.println("divide   = "+ StaticMethodDemo2.add() );
    }
}
