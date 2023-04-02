public class Q4 {
    public static boolean  prime(int n)
    {
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={2, 29, 51, 8, 4};
        int res=Integer.MIN_VALUE;
        for(int i:a)
            if(prime(i))
                res=Math.max(i, res);
        System.out.println("The Largest Prime number in given array: "+res);
    }
}
