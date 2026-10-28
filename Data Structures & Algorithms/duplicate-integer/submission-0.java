class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length,f=0;
        for (int i=0,j=1;i<n-1 && j<n;i++,j++)
        {
            if (nums[i] == nums[j])
            {
                f=1;
                break;
            } 
        }
        if (f == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}