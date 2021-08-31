// WAP to find the largest among the given three numbers.
import java.util.Scanner;
public class FindLargestNumber {
    public static void main (String[] args){
    int a,b,c,lg,temp;
    System.out.println("Enter 3 values A, B, C");
    Scanner obj = new Scanner(System.in);
    a = obj.nextInt();
    b = obj.nextInt();
    c = obj.nextInt();
    temp = a>b?a:b;
    lg = c>temp?c:temp;
    System.out.println("Largest Number is : "+lg);  
}
}

