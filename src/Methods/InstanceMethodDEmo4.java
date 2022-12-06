package Methods;

public class InstanceMethodDEmo4
{
    int num1=10;
    int num2=100;

   int m1() // instance method

    {
       return num1*num2;
    }

    public static void main(String[] args)
    {
        InstanceMethodDEmo4 ref=new InstanceMethodDEmo4();
        System.out.println("multiplication =  "+ref.m1());

        }


}
