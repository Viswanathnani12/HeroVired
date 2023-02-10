import java.util.*;
public class Q2 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashMap<Integer,Integer> h=new HashMap<>();
        int n;
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(!h.containsKey(a[i]))
            {
                h.put(a[i],1);
            }
        }
        for(Map.Entry e:h.entrySet())
        {
            System.out.print((int)e.getKey()+" ");
        }
        s.close();
    }
}
