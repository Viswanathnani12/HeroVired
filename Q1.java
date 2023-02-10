import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=s.nextInt();
        int a[]=new int[n];
        int m=-1;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(!h.containsKey(a[i]))
                h.put(a[i],1);
            m=Math.max(m,a[i]);
        }
        int j=1;
        while(j<=m)
        {
            if(!(h.containsKey(j)))
                System.out.print(j+" ");
            j++;
        }
        s.close();
    }
}
