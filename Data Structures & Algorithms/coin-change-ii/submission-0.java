class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i = 0; i<n; i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return coinWays(n-1 , coins , amount , dp);
    }

    public int coinWays(int idx , int[] coins , int target , int[][] dp)
    {
        if(target == 0)
        {
            return 1;
        }
        if(idx == 0)
        {
            if(target % coins[idx] == 0)
            {
                return 1;
            }

            return 0;
        }

        if(dp[idx][target] != -1)
        {
            return dp[idx][target];
        }




        int notTake = coinWays(idx-1 , coins , target , dp);
        int take = 0;
        if(coins[idx] <= target)
        {
            take = coinWays(idx, coins , target - coins[idx] , dp);
        }
        dp[idx][target] = take + notTake;

        return (take + notTake);


    }
}
