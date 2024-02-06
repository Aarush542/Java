// abstract class A 
// abstract method add() :no return and no argument 
// abstract method sub():no return and  argument
// abstract method multi(): return and no argument
// abstract method div(): return and  argument
// abstract method modular(): return and  argument



// class Main ex A

// main method access 

import java.util.Scanner;

abstract class A{

abstract void add();
abstract void sub();
abstract void multi();
abstract void div();
abstract void mod();
}

public class Main extends A{
   void add()
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st number for add");
   int a=sc.nextInt();
   System.out.println("Enter 2nd number for add");
   int b=sc.nextInt();
   System.out.println(a+b);
   }
   
   void sub()
   {
      Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st number for Sub");
   int a=sc.nextInt();
   System.out.println("Enter 2nd number for Sub");
   int b=sc.nextInt();
   System.out.println(a-b);
   }
   
   void multi()
   {
      Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st number for multi");
   int a=sc.nextInt();
   System.out.println("Enter 2nd number for multi");
   int b=sc.nextInt();
   System.out.println(a*b);
   }
   
   void div()
   {
      Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st number for div");
   int a=sc.nextInt();
   System.out.println("Enter 2nd number for div");
   int b=sc.nextInt();
   System.out.println(a/b);
   }
   
   void mod()
   {
      Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st number for Mod");
   int a=sc.nextInt();
   System.out.println("Enter 2nd number for Mod");
   int b=sc.nextInt();
   System.out.println(a%b);
   }
   public static void main(String[] args) {
    Main k =new Main();
    k.add();
    k.sub();
    k.multi();
    k.div();
    k.mod();  
   }
}