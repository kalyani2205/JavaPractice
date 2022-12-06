package polymorphism;
class  B
{

    void m1(int n)
    {
        System.out.println("m1 from class B " + n);
    }
}
public class A extends B
{
    void m1(int n)
    {
        System.out.println("m1 from class A " + n);
    }

    public static void main(String[] args) {
        System.out.println("runtime polymorphim : ");
        A  ref=new A();
        ref.m1(100);
        ref.m1(10);

    }
}
