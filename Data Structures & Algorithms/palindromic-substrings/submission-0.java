class Solution {
    public int countSubstrings(String s) {

        int n = s.length();
        int result = 0;
        for(int i = 0; i<n; i++)
        {
            int l = i;
            int r = i;
            while(l >=0 && r < n && s.charAt(l) == s.charAt(r))
            {
                result++;
                l -= 1;
                r += 1;
            }

            l = i;
            r = i +1;
            while(l >=0 && r < n && s.charAt(l) == s.charAt(r))
            {
                result++;
                l -= 1;
                r += 1;
            }
            

        }
        return result;
    }
}
