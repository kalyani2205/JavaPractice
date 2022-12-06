package polymorphism;

public class CompileDemo1
{
    void m1()
    {
        System.out.println("m1 method ");
    }
    void m1(int n)
    {
        System.out.println(" value of n : "+ n);
    }
    public static void main(String[] args) {

        CompileDemo1 ref=new CompileDemo1();
        ref.m1();
        ref.m1(100);
    }
}
