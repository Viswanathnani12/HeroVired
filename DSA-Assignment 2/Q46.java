class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums)
            s.add(i);
        int p=0;
        ArrayList<Integer> al=new ArrayList<>(s);
        Collections.sort(al);
        for(int i:al)
        {
            nums[p]=i;
            p++;
        }
        return s.size();
    }
}
