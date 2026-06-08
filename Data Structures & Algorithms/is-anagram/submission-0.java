class Solution {
    public boolean isAnagram(String s, String t) {
        
        int SizeS = s.length();
        int SizeT = t.length();

        if(SizeS != SizeT){
            return false;
        }

        Set<Character> uniqueS = new HashSet<>();
        Set<Character> uniqueT = new HashSet<>();

        for (char ch : s.toCharArray()) {
            uniqueS.add(ch);
        }

        for (char ch : t.toCharArray()) {
            uniqueT.add(ch);
        }

        return uniqueS.equals(uniqueT);
    }
}
