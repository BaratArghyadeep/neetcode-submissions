class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String , List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] chArray = str.toCharArray();
            Arrays.sort(chArray);

            String stringKey = new String(chArray);

            if(!map.containsKey(stringKey))
            {
                map.put(stringKey , new ArrayList<>());
            }

            map.get(stringKey).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
