class Employee
{
    private int age;
    private String name;
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int a)
    {
        this.age=a;
    }
    public int getAge()
    {
        return age;
    }

}
public class Getter
{
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.setName("vijay");
        e.setAge(20);
        System.out.println("your name is = "+e.getName());
        System.out.println("your age is = "+e.getAge());

    }
}