class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        double d=0;
        for(int i=0;i<nums1.length;i++)
            l.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
            l.add(nums2[i]);
        Collections.sort(l);
        if(l.size()%2!=0)
            d=(l.get(l.size()/2));
        else
            d=(l.get(l.size()/2)+(l.get((l.size()/2)-1)))/2.0;
        return d;    
    }
}
