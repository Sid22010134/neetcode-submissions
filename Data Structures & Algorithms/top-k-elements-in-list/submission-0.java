class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length+1];


        for(int key : freqMap.keySet()){
            int val = freqMap.get(key);

            if(bucket[val] == null){
                bucket[val] = new ArrayList<>();
            }

            bucket[val].add(key);
        }

        int[] ans = new int[k];
        int index = 0;
        
        for(int i = bucket.length - 1;i >= 0 && index < k;i--){
            if (bucket[i] != null) {
                for (int num : bucket[i]) {

                    ans[index++] = num;

                    if (index == k)
                        break;
                }
            }
        }

        return ans;

    }
}
