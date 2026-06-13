class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> resultMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] cnt = new int[26];

            for(int j = 0;j < strs[i].length(); j++){
                char c = strs[i].charAt(j);
                int asci = c - 'a';

                cnt[asci]++;
            }

            String key = Arrays.toString(cnt);

            if(resultMap.containsKey(key)){
                resultMap.get(key).add(strs[i]);
            }
            else{
                List<String> anagram = new ArrayList<>();
                anagram.add(strs[i]);
                resultMap.put(key,anagram);
            }
        }

        return new ArrayList<>(resultMap.values());
    }
}
