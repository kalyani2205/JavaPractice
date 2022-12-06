package Blocks;

public class instancedemo3
{
    {
        System.out.println( "instance  block 1 ");
    }
    {
        System.out.println( "instance  block 2  ");
    }
    {
    System.out.println( "instance  block 3 ");
}
    public static void main(String[] args)
    {
        System.out.println("blocks ");

        instancedemo3 ref=new instancedemo3();
        instancedemo3 ref1=new instancedemo3();
    }
}
