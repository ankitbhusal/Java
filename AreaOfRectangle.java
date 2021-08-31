// WAP to find area of rectangle.[area = L * B]
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main (String[] args){
    int l,b;
    float area;
    System.out.println("Enter value of L, B");
    Scanner obj = new Scanner(System.in);
    l = obj.nextInt();
    b = obj.nextInt();
    area = l*b;
    System.out.println("Result = "+area);  
    }
}
