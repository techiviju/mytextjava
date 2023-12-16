class ExThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;++i)
        {
            System.out.println("this is first A ~ "+i);
        }
        System.out.println("End thread 1st ~ ");    
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("this is first B ~ "+i);
        }
        System.out.println("End the thread B ");
    }
}
public class Prog12
{
    public static void main(String args[])
    {
        new ExThread().start();
        new B().start();
    }
}