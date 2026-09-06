class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];

        // for empty string 
        dp[0] = 1;
        for(int idx = 1; idx<=n; idx++)
        {
            if(s.charAt(idx-1) != '0')
            {

                dp[idx] += dp[idx-1];
            }

            // 2 digits 

            if(idx >=2)
            {

                int num = (s.charAt(idx-1) - '0') + (s.charAt(idx-2)-'0')*10;
                if(num >=10 && num <= 26)
                {
                    dp[idx] += dp[idx-2];
                }
            }


        }
        return dp[n];
    }

 
}
