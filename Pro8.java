class SuperClass {
    // Default constructor
    SuperClass() {
      System.out.println("SuperClass constructor called");
    }
  }
  
  class SubClass extends SuperClass {
    // Default constructor
     SubClass() {
      // super(); // This line is implicitly added by compiler
      System.out.println("SubClass constructor called");
    }
}
public class Pro8
{
    public static void main(String[] args) {
      SubClass a =new SubClass();
    }
  }
  