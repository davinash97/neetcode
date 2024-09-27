class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // Keep the count
        for(int i: nums) {
            map.compute(i, (key,value) -> {
                if(value == null)
                    value = 1;
                else
                    value = value + 1;
                return value;
            });
        }
        
        // Initalizing the bucket
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        // Filling the bucket with blank list
        for(int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // Populate the bucket with count
        for(Integer i: map.keySet()) {
            bucket[map.get(i)].add(i);
        }
        
        // Initializing the result array
        int[] result = new int[k];
        int idx = 0;

        // Adding k frequent elements
        for(int i = nums.length; i >=0; i--) {
            if(bucket[i] != null) {
                for(int j: bucket[i]) {
                    result[idx++] = j;
                    if(idx == k)
                        return result;
                }
            }
        }

        return result;
    }
}