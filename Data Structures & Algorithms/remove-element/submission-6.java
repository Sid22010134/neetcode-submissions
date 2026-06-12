class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;

        if((nums.length == 0) || ((nums.length == 1) && (nums[0] == val))){
            return 0;
        }
            

        while(i <= j){
            if(nums[j] == val){
                j--;
            }
            else if(nums[i] != val){
                i++;
            }
            else{
                swap(nums,i,j);
                i++;
                j--;
            }
        }

        return i;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];  // Save the first value
        arr[index1] = arr[index2]; // Move second value to first position
        arr[index2] = temp;      // Move saved value to second position
    }
}