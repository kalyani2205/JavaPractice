package Blocks;

public class blockDemo4
{
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

    public blockDemo4()
    {
        System.out.println("this is constructor ");
    }

    public static void main(String[] args) {

        blockDemo4 ref=new blockDemo4();

    }
}
     /*   static block
        instance block
        this is constructor
*/