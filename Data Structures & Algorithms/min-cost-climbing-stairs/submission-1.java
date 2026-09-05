class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return Math.min(calculateCost(n-1 , cost , dp) 
        , calculateCost(n-2, cost , dp));
    }

    public int calculateCost(int idx , int[] cost , int[] dp)
    {
         if (idx == 0) return cost[0];
        if (idx == 1) return cost[1];

        if(dp[idx] != -1)
        {
            return dp[idx];
        }


        dp[idx] = cost[idx] + Math.min(calculateCost(idx-1 , cost ,dp) , calculateCost(idx-2 , cost ,dp));

        return cost[idx] + Math.min(calculateCost(idx-1 , cost ,dp) , calculateCost(idx-2 , cost ,dp));
    }
}
