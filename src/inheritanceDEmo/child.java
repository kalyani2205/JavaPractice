package inheritanceDEmo;
class parent
{
    int a=10;
    void m1()
    {
        System.out.println("m1 from parent ");
    }

    public parent() {
        System.out.println("parent constructor");
    }
}
public class child extends parent
{
    int a=100;
    void m2()
    {
        System.out.println("m2 from child");
    }
    void m1()
    {
        System.out.println("m1 from child ");
        super.m1();
    }
    child()
    {
        System.out.println("child constructor");
    }


    public static void main(String[] args) {
        System.out.println("single  inheritance demo ");
        parent ref=new parent();
      //  ref.m2();
        ref.m1();
        System.out.println(ref.a);

    }
}
