import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("    1.CM to M");
            System.out.println("    2.M to KM");
            System.out.println("    3.KM to M");
            System.out.println("    4.M to CM");
            System.out.println();
            System.out.println("Enter your Menu:= ");
            int ch=s.nextInt();
            if(ch==1)
            {
                System.out.println("Enter the CM value:= ");

                double cm=s.nextDouble();
                System.out.println(cm+" CM = "+cm/100+" M");
            }
            else if(ch==2)
            {
                System.out.println("Enter the M value:= ");
                double m=s.nextDouble();
                System.out.println(m+" M = "+m/1000+" KM");
            }
            else if(ch==3)
            {
                System.out.println("Enter the KM value:= ");
                double km=s.nextDouble();
                System.out.println(km+" KM = "+km*1000+" M");
            }
            else if(ch==4)
            {
                System.out.println("Enter the M value:= ");
                double m=s.nextDouble();
                System.out.println(m+" M = "+m*100+" CM");
            }
            System.out.println("Do you want to Continue: ");
            s.nextLine();
            String op=s.next();
            if(op.equals("n")) break;
        }
    }
}
