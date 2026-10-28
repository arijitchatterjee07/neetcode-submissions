class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        for (int i=1;i<n;i++)
        {
          if ((i%2 != 0 && nums[i-1]>nums[i]) || (i%2 == 0 && nums[i-1]<nums[i]))
          {
            int temp=nums[i-1];
            nums[i-1]=nums[i];
            nums[i]=temp;
          }
        }
    }
}
