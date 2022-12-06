package Interface;

public interface I1
{
    abstract void m1();


}
class B
{
    public static void main(String[] args)
    {

I1 ref=()->{
    System.out.println("lembda expression ");
};
ref.m1();

    }

}
