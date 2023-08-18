				OOPS INHERITANCE EXE

		        	Single level Inherirance 


				// class Student{
				//     String name;
				//     int age;
				    
				//     public void printInfo(String name){
				//         System.out.println(name);
				//     }
				//     public void printInfo(int age){
				//         System.out.println(age);
				//     }
				//     public void printInfo(String name ,int age){
				//         System.out.println(name+" "+age);
				//     }
				// }

					 Multi-level Inherirance 

				// class Animal {
				//     String name;
				//     int leg;
				// }
				// class Hourse extends Animal{
				//     String name="Hourse";
				//     int leg=4;
				//     public void hourseInfo(){
				//         System.out.println(name);
				//         System.out.println(leg);
				//     }
				     
				    
				// }
				// class Dog extends Hourse{
				//     String name="Dog";   
				//     int leg=4;
				    
				//     void dogInfo(){
				//         System.out.println(name);
				//         System.out.println(leg);
				//     }
				// }

			
		
					Hybrid Inheritance					
					
				class Shape{
				    public void area(){
					System.out.println("Hello area");
				    }
				}
				class Triangle extends Shape{
				    public void area(int l,int h){
					System.out.println(1/2*l*h);
				    }
				}
				class Circle extends Shape{
				    public void area(int r){
					System.out.println((3.14)*r*r);
				    }
				}

				public class Main
				{
				    
					public static void main(String[] args) {
				    
				    // Student s1=new Student();
				    // s1.name="vijay";
				    // s1.age=20;
				    // s1.printInfo(s1.age);
				    
				    // Hourse h1=new Hourse();
				    
				    // Dog d1=new Dog();
				    // d1.dogInfo();
				    // d1.hourseInfo();
				    
				    //******** Shape class  *********///
				    Circle c=new Circle();
				    c.area();
				    c.area(5);
				    
				    Triangle t=new Triangle();
				    t.area();
				  
				    
					}
				}
