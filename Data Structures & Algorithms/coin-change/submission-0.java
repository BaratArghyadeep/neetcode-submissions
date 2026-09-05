class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 0; i<=n; i++)
        {
            Arrays.fill(dp[i] , -1);
        }
        int ans = minimumCoin(n-1 , coins , amount , dp);

        return ans >= 1e9 ? - 1 : ans;
    }

    public int minimumCoin(int idx , int[] coins , int target , int[][] dp)
    {
        if(idx == 0)
        {
            if(target % coins[idx] == 0)
            {
                dp[idx][target] = target/coins[idx];
                return target / coins[idx];
            }
            dp[idx][target] = (int)1e9;

            return (int) 1e9;
        }
       
        if(dp[idx][target] != -1)
        {
            return dp[idx][target];
        }


        int notTake = minimumCoin(idx-1, coins , target, dp);
        int take = (int) 1e9;
        if(coins[idx] <= target)
        {
            take = 1 + minimumCoin(idx , coins , target - coins[idx] , dp);
        }

        dp[idx][target] = Math.min(take,notTake);

        return Math.min(take, notTake);

    }
}
