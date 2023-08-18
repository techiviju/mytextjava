class MyEmployee{
private String name;
private int id;

public void setName(String n){
this.name=n;
}

public String getName(){
return name;
}

public void setId(int i){
this.id=i;
}

public int getId(){
return id;
}
}

public class Cwh_40_ch9{
public static void main(String[] args){
MyEmployee vijay=new MyEmployee();
vijay.setName("vijay chaudhari");
System.out.println(vijay.getName());
vijay.setId(522);
System.out.println(vijay.getId());

}
}