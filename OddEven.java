// WAP to find whether the given number is odd or even.
package oop.java;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        int a;
        System.out.println("Enter a Number: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
