
public class Q5 {
    public static void main(String[] args) {
        int a[]={3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        System.out.println("Array elements after moving Ones to end: ");
        for(int i:a)
            if(i!=1) System.out.print(i+" ");
        for(int i:a)
            if(i==1) System.out.print(i+" ");
    }    
}
