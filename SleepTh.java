class MyThread extends Thread
{
    public void run()
    {
    //     Thread th=Thread.CurrentThread();
    //     String name=th.getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println("this is a run "+i);
            try{
            Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("this is a Exception ==  "+e);
            }
        }
       
    }
}
public class SleepTh
{
    public static void main(String[] args)
    {
        MyThread m=new MyThread();
        m.start();

        // Thread th=Thread.CurrentThread();
        // String name=th.getName();

        for(int i=1;i<=5;i++)
        {
            System.out.println("this is a main  "+i);
           try{
            Thread.sleep(250);   
           }
           catch(InterruptedException e)
        {
            System.out.println("this is a Exception ==  "+e);
        }
        }
        

    }
}