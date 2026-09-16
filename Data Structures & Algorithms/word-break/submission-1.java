class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> dict = new HashSet<String>(wordDict);
        int n = s.length();
        Boolean[] dp = new Boolean[n];
      
        return canBreak(0 , s , dict , dp);

    }

    public boolean canBreak(int idx , String s , HashSet<String> dict , Boolean[] dp)
    {

        if(idx == s.length())
        {
            return true;
        }
        if(dp[idx] != null)
        {
            return dp[idx];
        }



        for(int i = idx + 1 ; i <= s.length(); i++)
        {
            String temp = s.substring(idx , i);
            if(dict.contains(temp) && canBreak(i , s , dict , dp))
            {
                dp[idx] = true;
                return true;
            }
        }

        dp[idx] = false;

        return false;


    }
}
