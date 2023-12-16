class Animal
{
    String name;
    int age;
    Animal(String name,int age)
    {
        this.name=name;
        this.age=age;

    }
    public void sleep()
    {
        System.out.println("Animal is sleeping "+name);
    }
}
class Dog extends Animal
{
    Dog(String name,int age)
    {
        super(name,age);
    }
    public void sound()
    {
        System.out.println(name+" is Barking and age is = "+age);
    }

}
public class Inheritance
{
    public static void main(String args[])
    {
        Dog d=new Dog("lucky" ,10);
        d.sleep();
        d.sound();
    }
}