class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int nextElement = 0, maxCount=1;

        for(int i: set) {
            int count = 1, currentNum = i;
            if(!set.contains(i-1)) {
                while(set.contains(currentNum+1)) {
                    currentNum++;
                    count++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }

        return maxCount;
    }
}