// WAP to find Area of circle. [area = pi * R * R] (use pi as constant).
import java.util.Scanner;
public class AreaOfCircle {
    public static void main (String[] args){
    int r;
    final float pi = 3.14f;
    float area;
    System.out.println("Enter value of R");
    Scanner obj = new Scanner(System.in);
    r = obj.nextInt();
    area = pi * r * r;
    System.out.println("Result = "+area);  
}
}
