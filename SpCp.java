import java.util.Scanner;
public class SpCp {
    public static void main(String[] args){
        float cp , sp, p, l, per;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter CP and SP");
        cp = obj.nextInt();
        sp = obj.nextInt();
        if(sp>cp){
            p = sp-cp;
            per = (p*100)/cp;
            System.out.println("The profit is : "+p);
            System.out.println("The profit % is : "+per);
            
        }
        else if(cp>sp){
            l = cp-sp;
            per = (l*100)/cp;
            System.out.println("The loss is : "+l);
            System.out.println("The loss % is : "+per);
        }
        else{
                System.out.println("Neutral");
                }
        
    }
}