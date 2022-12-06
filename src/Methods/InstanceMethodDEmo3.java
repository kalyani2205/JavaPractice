package Methods;

public class InstanceMethodDEmo3
{

   void add(int num1,int num2) // instance method

    {
        System.out.println("Addition =  "+ (num1+num2));
    }

    void multi(int num1,int num2) {
        System.out.println("multiplication = "+ (num1*num2 ));
    }

    void sub(int num1,int num2) {
        System.out.println("substraction = "+ (num1-num2));;
    }

    void div(int num1,int num2) {
        System.out.println("division  = "+ num1/num2);;
    }

    public static void main(String[] args)
    {
        InstanceMethodDEmo3 ref=new InstanceMethodDEmo3();

        ref.add(10,30);
        ref.sub(30,10);
        ref.multi(10,30);
        ref.div(30,10);

        }


}
