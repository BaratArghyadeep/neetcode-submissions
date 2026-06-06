class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num , map.getOrDefault(num,0) +1);

        }

        List<Integer> lst = new ArrayList<>(map.keySet());
        lst.sort((a, b) -> map.get(b) - map.get(a));

        for(int i = 0; i<k; i++)
        {
            ans[i] = lst.get(i);
        }

        return ans;

        
    }
}
