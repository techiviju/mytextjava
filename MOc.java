class Me1
{
    void disp()
    {   
        System.out.println("this is a super class methos");
    }
}
class Me2 extends Me1
{
    void disp()
    {
        System.out.println("this is a Sub class");
    }
}
public class MOc
{
    public static void main(String args[])
    {
        Me1 a=new Me2();
        a.disp();
        // a.disp();


        Me1 b=new Me1();
        b.disp();
    }
}