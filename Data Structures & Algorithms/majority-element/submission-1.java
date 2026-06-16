class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        int i = 0;

        while(i < nums.length){
            if(count == 0){
                candidate = nums[i];
                count++;
            }
            else if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }

            i++;
        }

        return candidate;
    }
}