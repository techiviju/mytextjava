			////  Oops exersice  /////

class Pen{
    String name;
    String type;
    
    public void write(){
        System.out.println("write method");
        System.out.println(this.name+ " " +this.type);
    }
}

class Student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.println("Name = "+this.name+ "\nAge = "+this.age);
    }
    
    /// parameterized co ///
    
    // Student(String name,int age){   ////  parameterized Constructor //
    //     System.out.println("Constructor");
    //     this.name=name;
    //     this.age=age;
    // }
    
  

//// copy co ///

Student(Student s2){
    this.name=s2.name;
    this.age=s2.age;
}

  Student(){
        
    }
}


public class Main
{
	public static void main(String[] args) {
	Pen pen1=new Pen();
	pen1.name="blue";
	pen1.type="bollpen";
	
	pen1.write();
	
///	Student s1=new Student("Vijay",20);  // parameterized Constructor //
    
    Student s1=new Student();
	s1.name="Vijay";    /// normal Constructor //
	s1.age=20;
// 	s1.printInfo();
	
	
	///  Copy co  //
	
	Student s2=new Student(s1);
	s2.printInfo();
	
	    
	}
}

}

				///   Copy Constructor Speacial ///

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name = " + this.name + "\nAge = " + this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Vijay", 20);
    ///    s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}


		////  POLYMORPHISM ///

class Student{
    String name;
    int age;
    
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class Main
{
	public static void main(String[] args) {
    
    Student s1=new Student();
    s1.name="vijay";
    s1.age=20;
    s1.printInfo(s1.age);
    s1.printInfo(s1.name);
    s1.printInfo(s1.name,s1.age);
    
	}
}


			***  INHERITANCE ***

        // 1) SINGLE INHERITANCE  //

class Shape{    // Base class //
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{  // Derived class //
    public void area (int l,int h){
        System.out.println(1/2*l*h);
    }
}
public class Main
{
	public static void main(String[] args) {
		Shape s1 = new Shape();
        s1.color = "red";
        s1.area();

        Triangle t1 = new Triangle();
        t1.color = "green"; // Set color for the Triangle
        int l = 5; // Define l
        int h = 2; // Define h
        t1.area(l, h); 

	// op // print only green///
	}
}


		/// 2) MULTIPLE INHERITANCE ///

        

class Shape {   // Base class //

    String color;
    String name;

    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {  // Derived class //

    public void area(int l, int h) {
        System.out.println(color);
        System.out.println(1/2 * l * h);
    }
}

class EquilateralTriangle extends Triangle{ // Derived class //
    public void area(int l ,int h){
        System.out.println(1/2*l*h);
    }
}

public class Main {
    public static void main(String[] args) {
      
    }
}




		*******	HIERARCHIAL INHERITANCE ****** 

class Shape{    //  BASE CLASS //
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{  // DERIVED CLASS //
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{         /// DERIVED CLASS //
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
