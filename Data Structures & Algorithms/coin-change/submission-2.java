class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        int[] dp = new int[amount+1];
        for(int target = 0; target <=amount; target++)
        {
            if(target % coins[0]== 0)
            {
                dp[target] = target/coins[0];
            }
            else
            {
                dp[target] =(int) 1e9;
            }
        }

        for(int i = 1; i<n; i++)
        {
           for(int target = 0; target <= amount; target++)
           {
                int notTake = dp[target];
                int take = (int) 1e9;
                if(coins[i] <= target)
                {
                    take = 1 + dp[target - coins[i]];
                }

                dp[target] = Math.min(take,notTake);
           }

        }

        int ans = dp[amount];
        return ans >= 1e9 ? - 1 : ans;
    }

   
}
