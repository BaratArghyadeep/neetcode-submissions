class Solution {
    public int numDecodings(String s) {

        int[] dp = new int[s.length()];
        Arrays.fill(dp , -1);

        return decode(s.length() - 1 , s , dp);
    }

    public int decode(int idx , String s , int[] dp)
    {
        if(idx < 0)
        {
         
            return 1;
           
        }

        
        if(dp[idx] != -1)
        {
            return dp[idx];
        }

        int ways = 0;



        // single 
        if(s.charAt(idx) != '0')
        {
             ways = decode(idx - 1 , s , dp);
             dp[idx] = ways;

        }
        

        // 2 digits
        if(idx > 0)
        {
            int num = (s.charAt(idx) - '0') + (s.charAt(idx-1) - '0')*10;
            if(num >= 10 && num <=26)
            {
                ways += decode(idx-2 , s, dp);

            }
            
        }
        dp[idx] = ways;

        return ways;
    }
}
