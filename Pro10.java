Interface Ani
{
    abstract void method()
    {
    System.out.println("this is a super interface ");
    }
}
class Bull implements Ani
{
     void sound()
    {
        System.out.println(" sound is hammmma");
    }
}
class Got implements Ani
{
    void color()
    {
         System.out.println("color of got  is = white ");
    }
}
public class Pro10
{
    public static void main(String args[])
    {
        Got g=new Got();
        Bull b=new Bull();
        Ani a=new Ani();
        a=g;
        a.color();
        a=b;
        a.sound();

    }
}
//this program is shown error find
// program 11 is available in inheritance pro... 