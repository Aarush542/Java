// 3)
// Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
// to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
// Tanul should say “Palindrome”. If not, he should say “Not a Palindrome”. If the number is
// negative, print “Invalid Input”. Help Tanul by writing a program.
// Sample Input 1 :
// 21212
// Sample Output 1 :
// Palindrome
// Sample Input 2 :
// 6186

// Sample Output 2 :
// Not a Palindrome

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter value to check for pallindrome");
        int a=obj.nextInt();
        int rem,sum=0;
        int temp=a;
        if(a<=0)
        {
            System.out.println("Invalid Input");
        }
        else{
        while(a>0)
        {
            rem=a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        if(temp==sum)
        {
            System.out.println("Tanul : Pallindrome");
        }
        
        else{
            System.out.println("Tanul : Not Pallindrome");
        }
    } 
    }
}