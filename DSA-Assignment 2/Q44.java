class Solution {
    public int[] searchRange(int[] n, int t) {
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==t)
            {
                res[0]=i;
                break;
            }
        }
        for(int i=n.length-1;i>=0;i--)
        {
            if(n[i]==t)
            {
                res[1]=i;
                break;
            }
        }
            
        return res;        
    }
}
