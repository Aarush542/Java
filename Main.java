// 5)
// class A 
// constructor :default :this is a constructor
// add method:a+b :no return and no argument 
// sub method:a-b  :no return and  argument 

// class B 
// constructor :parameter :a*b 
// mod method:a%b : return and no argument 
// multi method:a*b  : return and argument 


// Main class 
// Main constructor :parameter type 
// sub method:a-b  :no return and  argument 


// main method :
// A 
// B 
// Main class 

import java.util.Scanner;

class A{
   A show()
   {
      System.out.println("This is a constructor");
      return this;
   }
   void add()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a for addition");
      int a=sc.nextInt();
      System.out.println("Enter b for addition");
      int b=sc.nextInt();
      System.out.println(a+b);

   }
   void sub(int a,int b)
   {
      System.out.println(a-b);
      
   }
}
class B{
   B(int c,int d)
   {
System.out.println(c*d);
   }
int mod()
{
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter 1st value for mod");
   int a=sc.nextInt();
   System.out.println("Enter 1st value for mod");
   int b=sc.nextInt();
return a%b;
}

int multi(int e, int f)
{
return e*f;
} 
}
public class Main {
    void a(int g, int h)
    {
      System.out.println(g-h);
    }
   public static void main(String[] args) {
      A k=new A();
      k.show();
      k.add();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a for subtraction");
      int a=sc.nextInt();
      System.out.println("Enter b for subtraction");
      int b=sc.nextInt();
      k.sub(a, b);
      System.out.println("Enter 1st value for Multi");
      int c=sc.nextInt();
      System.out.println("Enter 2nd value for Multi");
      int d=sc.nextInt();
      

      B k1=new B(c, d);
      System.out.println(k1.mod());
      System.out.println("Enter 1st number for multiplication");
      int e=sc.nextInt();
      System.out.println("Enter 2nd number for multiplication");
      int f=sc.nextInt();
      System.out.println(k1.multi(e, f));
      System.out.println("Enter number");
      sc.nextInt();

      Main k2=new Main();
      System.out.println("Enter g for subtraction");
      int g=sc.nextInt();
      System.out.println("Enter h for subtraction");
      int h=sc.nextInt();
      k2.a(g, h);
      

      
      
   
   }
}