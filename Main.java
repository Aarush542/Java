// // 11)
// // Design a Java program to calculate the income tax for an individual based on their annual income. 
// The program should apply different tax rates to different income ranges as defined by the tax laws. 
// The tax rates should be applied progressively, with higher income levels incurring a higher tax rate.
//  The program should prompt the user to input their income, and then it should determine the tax owed based
//   on the following income ranges and associated tax rates:
// // Income up to $50,000: 10% tax
// // Income from $50,001 to $100,000: 20% tax
// // Income over $100,000: 30% tax

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter annual income");
        int a =sc.nextInt();
        if(a>=50000){
            int income=a-(10/100);
            System.out.println(income);
        }

    }
}