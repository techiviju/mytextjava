		//  ch 8 practice set Q 1  //

class Employee{
int salary;
String name;

public int getSalery(){
return salary;
}

public String getName(){
return name;
}

public String setName(String n){
name=n;

}

}
public class Ch8_Practice{

public static void main(String[]args){
Employee vijay=new Employee();
vijay.setName("vijay Chaudhari");
System.out.println(vijay.getName());

}

}