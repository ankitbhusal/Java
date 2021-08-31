// Menu Driven Arithmetic Operation! 
package oop.java;
import java.util.Scanner;
public class MenuDrivenArithmeticOperation {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        float result = 0;
        System.out.println("Enter Two Numbers for Arithmetic Operation: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");5
        System.out.println("5 : Exit");
        System.out.println("Enter your choice: ");
        c = obj.nextInt();
        switch (c) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Invalid Choice");

        }
        System.out.println("Result of given operation is: " + result);
    }

}
