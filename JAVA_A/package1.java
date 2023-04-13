import myPackage.MyClass;

public class package1 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "GeeksforGeeks";
      
      // Creating an instance of class MyClass in 
      // the package.
      MyClass obj = new MyClass();
      
      obj.getNames(name);
   }
}