
// 15)
// char match 
// a =>apple 
// b :ball 
// c :cat 
// not match

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a for apple, b for ball, c for cat");
        String a=obj.nextLine();
        if(a.equals("a")){
            System.out.println("Apple");
        }
        else if(a.equals("b")){
            System.out.println("Ball");
        }
        else if(a.equals("c")){
            System.out.println("Cat");
        }
    }
}