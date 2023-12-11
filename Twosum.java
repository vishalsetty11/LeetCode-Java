class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] twosum = new int[2];
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    twosum[0]=i;
                    twosum[1]=j;
                return twosum;
                }
            }
        }
         return new int[2];   
    }
}
