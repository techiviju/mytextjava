public class Catch
{
    public static void main(String args[])
    {
        try
        {
            int a,b;
            a=20;
            b=0;
            float c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("this is a arithamatic exception"+e);
        }

    }
}