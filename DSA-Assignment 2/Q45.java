class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums.length-1)
            return nums.length-1;
        else{
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                return i;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>target)
                return i;
        }
        }
        return 0;
    }
}