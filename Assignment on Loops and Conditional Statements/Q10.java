import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        System.out.println("Starting Index: ");
        int si=s.nextInt();
        System.out.println("Ending Index: ");
        int ei=s.nextInt();
        System.out.println("Substring of "+str+" from "+si+" to "+ei+" is: "+str.substring(si,ei+1));
    }
}
