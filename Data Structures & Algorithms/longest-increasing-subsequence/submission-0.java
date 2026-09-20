class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int i = 0; i<n; i++)
        {
            Arrays.fill(dp[i] , -1);
        }

        return lis(0, -1 , nums , n, dp);
    }

    public int lis(int idx , int prev , int[] nums , int n , int[][] dp)
    {
        if(idx == n)
        {
          
            return 0;
        }

        if(dp[idx][prev+1] != -1)
        {
            return dp[idx][prev+1];
        }



        int notTake = lis(idx+1 , prev , nums , n, dp);

        int take = 0;
        if(prev == -1 || nums[idx] > nums[prev])
        {
            take = 1 + lis(idx+1 ,idx , nums ,n ,dp);
        }

        dp[idx][prev+1] = Math.max(take, notTake);

        return Math.max(take, notTake);
    }
}
