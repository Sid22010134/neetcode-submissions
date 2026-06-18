class Solution {
    
    public void merge(int[] nums,int si,int mid,int ei){
        int merged[] = new int[ei-si+1];
        int indx1 = si;
        int indx2 = mid+1;
        int mergeIndex = 0;

        while(indx1 <= mid && indx2 <= ei){
            if(nums[indx1] <= nums[indx2]){
                merged[mergeIndex++] = nums[indx1++];
            }else{
                merged[mergeIndex++] = nums[indx2++];
            }
        }

        while(indx1 <= mid){
            merged[mergeIndex++] = nums[indx1++];
        }

        while(indx2 <= ei){
            merged[mergeIndex++] = nums[indx2++];
        }

        for(int i=0,j=si; i < merged.length;i++,j++){
            nums[j] = merged[i];
        }

    }
    
    public void divide(int[] nums,int si,int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        divide(nums,si,mid);
        divide(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }

    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length - 1);

        return nums;
    }
}