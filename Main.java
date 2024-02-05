// A ex B
// show1 :A class 

// B ex C
// show2 : B class

// C ex D
// show 3 :C class 

// D 
// show 4:D class 

// Main
// one child k through all properties access
class A extends B{
   void show1()
   {
      
      System.out.println("A class");
   }
}

class B extends C{
   
   void show2()
   {
      
      System.out.println("B class");
   }
}

class C extends D{
   
   void show3()
   {
      System.out.println("C class");
   }
}

class D{
   void show4()
   {
      System.out.println("D class");
   }
}
public class Main {

   public static void main(String[] args) {
      A k=new A();
      k.show1();
      k.show2();
      k.show3();
      k.show4();
   }
}