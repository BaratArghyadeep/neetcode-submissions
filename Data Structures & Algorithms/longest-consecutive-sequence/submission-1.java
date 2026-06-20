class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }

        int max = 0;
        for(int num : nums)
        {
            int len = 1;
            if(!set.contains(num-1))
            {
                while(set.contains(num+1))
                {
                    len++;
                    num++;
                }
                max = Math.max(len , max);

            }
        }

        return max;
    }
}
