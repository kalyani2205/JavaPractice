package FinalKeyword;

public class FinalDemo
{
final void m1()
{
    System.out.println("kalyani final .... ");
}
    public static void main(String[] args) {
       final int a=100;
       //  a=300;
        System.out.println("value of a  =  "+ a);
        FinalDemo ref=new FinalDemo();
        ref.m1();
    }
}
