// // Question 8: Ticket Booking System
// // Design a ticket booking system for a cinema that calculates the ticket price based on the age of the customer. 
// Children (age < 12) get a 50% discount, 
// while seniors (age >= 65) get a 30% discount.

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter age for ticket discount");
        int age=obj.nextInt();
        int price=300;
        System.out.println("Ticket Price"+price);
        
        if(age<12)
        {
            int discount=price-(price*50/100);
            System.out.println("Ticket Price for Children after Discount: "+discount);

        }
        else if(age>=65)
        {
            int discount=price-(price*30/100);
            System.out.println("Ticket Price for Senior Citizen after Discount: "+discount);
        }
        else
        {
            System.out.println("Ticket price for Adult: "+price);
        }
    }
}