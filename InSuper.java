class A
{
    String n;
    String color;
    A(String n,String color)
    {
        this.n=n;
        this.color=color;
    }
    public void sleep()
    {
        System.out.println(n+" is a sleeping ");
    }
}
class Cat extends A
{
    Cat(String n,String color)
    {
        super(n,color);
    }
    public void sound()
    {
        System.out.println(n+" sound is maaauuuu and her color is "+color);
    }
}
public class InSuper
{
    public static void main(String args[])
    {
        Cat c=new Cat("LUCKY","BLACK");
        c.sleep();
        c.sound();
    }
}