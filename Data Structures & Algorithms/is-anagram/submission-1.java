class Solution {
    public boolean isAnagram(String s, String t) {
        
        int SizeS = s.length();
        int SizeT = t.length();

        if(SizeS != SizeT){
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
