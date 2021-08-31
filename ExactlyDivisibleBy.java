// WAP to find whether the given number is exactly divisible by 4 and 10.
package oop.java;
import java.util.Scanner;
public class ExactlyDivisibleBy {
    public static void main(String[] args){
        int a;
        System.out.println("Enter a Number: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        if(a%4==0 && a%10==0){
            System.out.println("Number is exactly divisible by 4 and 10");
        }
        else{
            System.out.println("Number isnot divisible by 4 and 10");
        }
    }
}
