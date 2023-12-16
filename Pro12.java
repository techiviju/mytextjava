class Aa extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("this is a thread A = "+i);
        }
        System.out.println("Exit from thread A");
    }
}
class X extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println("this is a thread B = "+i);
        }
        System.out.println("exit from thread B ");
    }
}
class C extends Thread
{
    public void run()
    {
    for(int i=1;i<=5;i++)
    {
        System.out.println("this is a thead C = "+i);
    }
    System.out.println("Exit From C ");
}
}
public class Pro12
{
    public static void main(String args[])
    {
        new Aa().start();
        new B().start();
        new C().start();
    }
}