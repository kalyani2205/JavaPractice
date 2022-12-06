package Encapsulation;
class EncapsulationDemo
{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

public class EncapsulationDEmo1

{
    public static void main(String[] args)
    {
        System.out.println("Encapsulation demo ");
        EncapsulationDemo ref=new EncapsulationDemo();
        ref.setNum1(100);
        ref.setNum2(200);

        System.out.println("value of num1 =   " + ref.getNum1() );
        System.out.println("value of num2 =   " + ref.getNum2() );


    }
}
