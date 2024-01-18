// 5)
// A class 
// constructor  
// show1
// show2

// B class 
// constructor  
// show3
// show4

// Main class 
// constructor
// show5
// show6

// main() :access  
class A{
    A()
    {
System.out.println("constructor");
    }
    void show1()
    {
System.out.println("show1");
    }
    void show2()
    {
System.out.println("show2");
    }
}
class B{
    B()
    {
       System.out.println("constructor"); 
    }
    void show3()
    {
System.out.println("show3");
    }
    void show4()
    {
      System.out.println("show4");  
    }
}
class C{
    C()
    {
      System.out.println("constructor");  
    }
    void show5()
    {
System.out.println("show5");
    }
    void show6()
    {
        System.out.println("show6");
    }
}
public class Main {

    public static void main(String[] args) {
        A obj=new A();
        obj.show1();
        obj.show2();

        B obj1=new B();
        obj1.show3();
        obj1.show4();

        C obj2=new C();
        obj2.show5();
        obj2.show6();
    }
}