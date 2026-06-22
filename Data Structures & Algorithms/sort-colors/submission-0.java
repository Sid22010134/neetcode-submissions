class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;

        if (nums == null || nums.length <= 1) {
            return;
        }

        while(m <= h){
            if(nums[m] == 0){
                swap(nums,l,m);
                m++;
                l++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else{
                swap(nums,m,h);
                h--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}