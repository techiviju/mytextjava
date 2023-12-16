abstract class A 
{
    abstract void callme();
    void method()
    {
        System.out.println("this a super abstract class ");
    }
}
class B extends A 
{
    void callme ()
    {
        System.out.println("hello this is a sub class = ");
    }
}
public class Pro9
{
    public static void main(String args[])
    {
        A a=new B();
        a.callme();
        a.method();

    }
}