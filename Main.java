// email 
// password 
// name 
// contact
// addresss 
// stream :BCA BBA 
// language :english , hindi 
// percentage :float 

// user input 
// getter settor method 

import java.util.Scanner;

public class Main {
 String Name;
 Long Contact;
 String Email;
 String Address;
 String Stream;
 String Language;
 Float Percentage;

void form(String Name,Long Contact,String Email,String Address,String Stream,String Language,Float Percentage)
{
this.Name=Name;
this.Contact=Contact;
this.Email=Email;
this.Address=Address;
this.Stream=Stream;
this.Language=Language;
this.Percentage=Percentage;
}

String get()
{
   return Name;
}

long get1()
{
   return Contact;
}

String get2()
{
   return Email;
}

String get3()
{
   return Address;
}

String get4()
{
   return Stream;
}

String get5()
{
   return Language;
}

float get6()
{
   return Percentage;
}
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Name");
      String Name=sc.nextLine();
      System.out.println("Enter Contact");
      Long Contact=sc.nextLong();
      sc.nextLine();
      System.out.println("Enter Email");
      String Email=sc.nextLine();
      System.out.println("Enter Address");
      String Address=sc.nextLine();
      System.out.println("Enter Stream");
      String Stream=sc.nextLine();
      System.out.println("Enter Language");
      String Language=sc.nextLine();
      System.out.println("Enter Percentage");
      Float Percentage=sc.nextFloat();

      Main k=new Main();
      k.form(Name, Contact, Email, Address, Stream, Language, Percentage);
      System.out.println("Name "+k.get());
      System.out.println("Contact "+ k.get1());
      System.out.println("Email "+k.get2());
      System.out.println("Address "+k.get3());
      System.out.println("Stream "+k.get4());
      System.out.println("Language "+k.get5());
      System.out.println("Percentage "+k.get6());
      
}
}