class EThread extends Thread
{
    public void run()
    {
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println(i);
        // }

        // Exception in thread 
        int a=10/0;

    }
  
}
public class ExThread
{
    public static void main(String[] args)
    {
        // MULTIPLE THREAD 

        // Thread th=new Thread();
        // th.start();
        // EThread t=new EThread();
        // t.start();
      
        // EThread t1=new EThread();
        // t1.start();
        
        // EThread t2=new EThread();
        // t2.start();
        // BThread t2=new BThread();
        // t2.start();

        // Exception
        
        EThread Exception =new EThread();
        // Exception.start();
        Exception.run();

    }
}