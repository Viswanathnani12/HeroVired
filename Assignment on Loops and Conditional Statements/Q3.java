import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Before Swap");
        System.out.println("num1:= "+n1+" and num2:= "+n2);
        int t=n1;
        n1=n2;
        n2=t;
        System.out.println("After Swap");
        System.out.println("num1:= "+n1+" and num2:= "+n2);
    }
}
