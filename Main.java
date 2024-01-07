// number swap :
// without third variable 

import java.util.*;

public class Main{
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println("Values of a is "+a);
        System.out.println("Values of b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap values of a " +a);
        System.out.println("Swap values of b " +b);
    }
}