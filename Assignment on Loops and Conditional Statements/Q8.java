import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int n1=s.nextInt();        
        System.out.println("Enter num2: ");
        int n2=s.nextInt();        
        System.out.println("Enter num3: ");
        int n3=s.nextInt();
        System.out.println("The Smallest Number: "+Math.min(Math.min(n1,n2),n3));
        System.out.println("The Largest Number: "+Math.max(Math.max(n1,n2),n3));
        System.out.println("Average of all Three  Numbers: "+(n1+n2+n3)/3);
    }
}
