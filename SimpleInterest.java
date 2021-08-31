//WAP to find simple interest. (Si = (P*T*R) /100)
package oop.java;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
    int p, t, r;
    float si;
    System.out.println("Enter value of P, T, R");
    Scanner obj = new Scanner(System.in);
    p = obj.nextInt();
    t = obj.nextInt();
    r = obj.nextInt();
    si = (p*t*r)/100f;
    System.out.println("Result = "+si);    
}
}
