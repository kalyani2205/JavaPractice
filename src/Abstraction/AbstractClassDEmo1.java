package Abstraction;

abstract class A
{
    int num=10;
    void m2()
    {
        System.out.println(" normal method  from abstract class  ");
    }
    abstract void m1();

}
public class AbstractClassDEmo1 extends A

{
    public void m1()
    {
        System.out.println("hello abstrct m1 method override method ");
    }

    public static void main(String[] args) {
        AbstractClassDEmo1 ref=new AbstractClassDEmo1();

        ref.m1();
        ref.m2();
        System.out.println("value of num  =  " + ref.num);
    }

}
