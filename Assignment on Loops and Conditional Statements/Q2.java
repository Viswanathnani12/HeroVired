import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Total Marks:");
        double tm=s.nextDouble();
        System.out.println("Enter Marks Obtained:");
        double sm=s.nextDouble();
        double per=(sm/tm)*100;
        char grade='a';
        double gpa=0;
        if(per>=0 && per<=59)
        {
            gpa=0.0;
            grade='F';
        }
        else if(per>=60 && per<=69)
        {
            gpa=1.0;
            grade='D';
        }
        else if(per>=70 && per<=79)
        {
            gpa=2.0;
            grade='C';
        }
        else if(per>=80 && per<=89)
        {
            gpa=3.0;
            grade='B';
        }
        else if(per>=90 && per<=100)
        {
            gpa=4.0;
            grade='A';
        }
        System.out.println("Percentage:= "+per);
        System.out.println("Grade:= "+grade+" ,GPA:= "+gpa);
        s.close();
    }
}
