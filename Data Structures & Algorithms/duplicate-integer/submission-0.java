class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int num : nums) unique.add(num);
        int setSize = unique.size();

        if(setSize != nums.length){
            return true;
        }

        return false;

    }
}