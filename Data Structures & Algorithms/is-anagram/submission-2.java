class Solution {
    public boolean isAnagram(String s, String t) {
        
        int SizeS = s.length();
        int SizeT = t.length();

        if(SizeS != SizeT){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < SizeS; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
