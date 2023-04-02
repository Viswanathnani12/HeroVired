import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.println("Enter the number:= ");
            int n=s.nextInt();
            if(n%2==0)
                System.out.println("The given Number "+n+" is a Even Number");
            else
                System.out.println("The given Number "+n+" is a Odd Number");
            System.out.println("Do You want To Continue: Y/N ");
            String c = s.next();
            if(c.equals("n") || c.equals("N")) break;
        }
        s.close();
    }
}
