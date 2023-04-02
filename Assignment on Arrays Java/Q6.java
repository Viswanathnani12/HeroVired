import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        int a[]={3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int s[]={1, 2, 3, 5, 9};
        HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
                hm.put(a[i],hm.get(a[i])+1);
            else
                hm.put(a[i],1);
        }
        for(int i:s)
        {
            int f=hm.getOrDefault(i,0);
            System.out.println("Frequency of "+i+" :"+f);
        }
    }
}
