package Methods;

public class InstanceMethodDEmo2
{

    void add(int num1 ,int num2) // instance method

    {
        System.out.println("addition =   "+ (num1+num2));
    }

    public static void main(String[] args)
    {
        InstanceMethodDEmo2 ref=new InstanceMethodDEmo2();
        ref.add(100,300);

        }


}
