class Solution {
    public int majorityElement(int[] nums) {
        // Implementing Boyer-Moore Voting Algo

        int cnt = 0;
        int elem = 0;

        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                elem = nums[i];
                cnt++;
            } else if (nums[i] == elem) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return elem;
    }
}