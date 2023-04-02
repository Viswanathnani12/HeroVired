import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int sum=0,c=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:a)
        {
            sum+=i;
            c++;
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        System.out.println("The element with the Minimum value: "+min);
        System.out.println("The element with the Maximum value: "+max);
        System.out.println("Average of all array elements: "+sum/c);
        System.out.println("Total number of array elements: "+c);
        s.close();
    }
}
