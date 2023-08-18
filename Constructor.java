class Employee_a {
   

    Employee_a(String n,int i){
	System.out.println("The Employee name is = "+n);
	System.out.println("The is is  = "+i);

	}
	
	Employee_a(String n,int i,int sal){
	System.out.println("The Employee name is = "+n);
	System.out.println("The id is  = "+i);
	System.out.println("The salary is  = "+sal);
}


}

public class Constructor {
    public static void main(String[] args) {
        Employee_a viju = new Employee_a("Vijay",10);
	
	Employee_a sachin=new Employee_a("Sachine",11,100);
	Employee_a yash=new Employee_a("Yash",52);

      
    }
}
