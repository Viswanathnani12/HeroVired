import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int a[]={23, 21, 44, 32, 12};
        Arrays.sort(a);
        System.out.print(" The elements in ascending order: ");
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
        System.out.print(" The elements in descending order: ");
        for(int i=a.length-1;i>=0;i--)
            System.out.print(a[i]+" ");
    }
}
