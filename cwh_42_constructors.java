class MyMainEmployee{
private int id;
private String name;

public MyMainEmployee(){
id = 45;
name="my name is vjay";
}
public MyMainEmployee(String myName){
id = 45;
name=myName;
}

public MyMainEmployee(){
id = 45;
name="vijay chaudhari";
}

public String getName(){return name;}

public void setName(String n){this.name=n;}

public void setId(int i){this.id=i;}

public int getId(){return id;}

}

public class cwh_42_constructors {
    public static void main(String[] args) {
	MyMainEmployee vijay=new MyMainEmployee("okay Vijay");
	vijay.setName("vijay chaudhari");
	vijay.setId(90);	
	System.out.println(vijay.getName());
	System.out.println(vijay.getId());
	

    }
}
