class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = target - nums[i];
            if (map.containsKey(count)) {
                return new int[]{map.get(count), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}