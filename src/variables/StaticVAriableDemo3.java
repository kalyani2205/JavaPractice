package variables;
class B
{
    static int num1=20;
    static int num2=10;
}
public class StaticVAriableDemo3
{
    public static void main(String[] args) {
        System.out.println("static variable demo");

        System.out.println("num1  = " +B.num1);
        System.out.println("num2  = " +B.num2);

    }
}
/*
static varibale
        we can declare with static keywords
variable access with the help of class name because variable is static */
