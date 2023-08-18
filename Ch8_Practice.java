		//  ch 8 practice set Q 1  //

		//  ** Q1 ** //
class Employee{
int salary;
String name;

public int getSalary(){
return salary;
}

public String getName(){
return name;
}

public void setName(String n){
name=n;

}

}


		/// *** Q2 *** //
class CellPhone{

public void ringing(){
System.out.println("Ringing...");
}

public void vibrating(){
System.out.println("***Vibrating....***");
}

public void callFrd(){
System.out.println("Calling Shreyash");
}

}

		/// ***  Q3 *** //

class Square{
int side;

public int area(){
return side*side;
}

public int perimeter(){

return 4*side;
}


}

		// ** Q4 
class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize sides
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

		//** Q5
class Tommy{
public void hit(){
System.out.println("Hitting the enemy");
} 

public void run(){
System.out.println("Running the enemy");
}

public void fire(){
System.out.println("Firing the enemy");
}



}

		// ** Q6 
class Circle {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference (perimeter)
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Ch8_Practice{

public static void main(String[]args){
/*
Employee vijay=new Employee();
vijay.setName("vijay Chaudhari");
vijay.salary=24500;
//vijay.getName();
//System.out.println(vijay.getName());
//System.out.println(vijay.getSalary());

	// Q 2

CellPhone lava=new CellPhone();
lava.callFrd();
lava.vibrating();
lava.ringing();

	// Q3
Square sq=new Square();
sq.side=3;
System.out.println(sq.area());
System.out.println(sq.perimeter());

	// Q4 ....  not solved


// Create a rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Calculate and display area
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Calculate and display perimeter
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);
	// Q5 ....

/*Tommy game=new Tommy();
game.fire();
game.run();
game.hit();
*/

	/// Q6 ...

       // Create a circle object
        Circle circle = new Circle(5.0);

        // Calculate and display area
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);

        // Calculate and display circumference
        double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);


}

}