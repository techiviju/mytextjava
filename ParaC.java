class Hello
{
    Hello(int a)
    {
        System.out.println("this is a first constructor "+a);
    }
    Hello(int a,int b)
    {
        int sum=a+b;
        System.out.println("sum is = "+sum);
    }
    
}
public class ParaC
{
    public static void main(String args[])
    {
        Hello h=new Hello(10);
        Hello n=new Hello(10,50);
    }
}