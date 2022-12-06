package variables;
class A
{
    int num1;// instance variable
    int num2;

    public A(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class InstanceVariabledemo3
{
    public static void main(String[] args) {
        System.out.println("instance variable demo ");
        A a=new A(10,30);
        System.out.println(" value of num 1  = " + a.num1);
        System.out.println(" value of num 2  = " + a.num2);

    }
}
/*
instance varibale
       first create object
       how to access
       variable access with the help of object refernce  because variable is instance.
       we can declare out side class components
       inside class
*/
