package Multithreading;

public class Multi {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            for (int i=0;i<10;i++)
            {
                System.out.println(i);
            }
        });
        thread1.start();
        thread1.join();
        System.out.println(Thread.currentThread().getName());
    }
}
