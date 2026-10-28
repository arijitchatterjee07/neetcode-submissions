class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length,f=0;
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (nums[i] == nums[j])
                {
                    f=1;
                    break;
                } 
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