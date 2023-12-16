class Me
{
    void disp(int a)
    {
        System.out.println("hello a = "+a);

    }
    void disp(int a,int b)
    {
        int sum=a+b;
        System.out.println("hello a  b = "+sum);
    }
}
public class MethodOver
{
    public static void main(String args[]) 
    {
        Me a=new Me();
        a.disp(10);
        a.disp(10,20);
    }
}