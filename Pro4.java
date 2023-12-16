class Ab
{
    public Ab()
    {
        System.out.println("this is a super class c ");
    }
    void calculate(int a)
    {
        System.out.println("tjis is a super mehtods "+a);
    }
}
class Ba extends Ab
{
    Ba()
    {
        System.out.println("his is a sub co ");
    }
    void calculate(int a,int b)
    {
        System.out.println("this is a + b "+(a+b));
    }

}
public class Pro4
{
    public static void main(String args[])
    {
        // Ab a=new Ab();
        // a.calculate(20);

        Ba b=new Ba();
        b.calculate(60,10);
        b.calculate(50);
    }
}