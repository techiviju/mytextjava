class Pen{
String color;
String type;
public void write(){
System.out.println("Write someting");
System.out.println(this.color);
}

}
public class Oops_class{
public static void main(String[]args){
Pen p=new Pen(); //object 
p.color="red";
p.type="Ball Pen";
p.write();

}

}
