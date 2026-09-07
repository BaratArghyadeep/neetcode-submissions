class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];

        return canBreak(0, s, dict, dp);
    }

    private boolean canBreak(int start, String s,
                             Set<String> dict,
                             Boolean[] dp) {

        if (start == s.length()) {
            return true;
        }

        if (dp[start] != null) {
            return dp[start];
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);

            if (dict.contains(word)
                    && canBreak(end, s, dict, dp)) {
                return dp[start] = true;
            }
        }

        return dp[start] = false;
    }
}