class Solution {
    //This problem can be solved using Boyer-Moore Algorithm
    //as it is mentioned in the question that the majority element can exist
    //not more than n/2 times and this algo is used to find MAJORITY Element
    //Note that to find elements with frequency n/k times maintain k-1 candidates i.e here 1
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