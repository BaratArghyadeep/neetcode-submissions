class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n == 0)
        {
            return nums[0];
        
        }

        if(n == 2)
        {
            return Math.max(nums[0] , nums[1]);
        }
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return robHelper(n-1, nums , dp);
    }

    public int robHelper(int idx , int[] nums , int[] dp)
    {

        if(idx == 0)
        {
            dp[idx] = nums[idx];
            return nums[idx];

        }

        if(idx == 1)
        {
            dp[idx] = Math.max(nums[0] , nums[1]);
            return Math.max(nums[0] , nums[1]);
        }

        if(dp[idx] != -1)
        {
            return dp[idx];
        }


        int notTake = robHelper(idx-1 , nums , dp);
        int take = nums[idx] + robHelper(idx-2 , nums, dp);
        dp[idx] = Math.max(notTake , take);
        return Math.max(notTake,take);
    }
}
