class Solution {
    public int[] productExceptSelf(int[] nums) {

        int multiple = 1;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            result[i] = multiple;
            multiple *= nums[i];
        }

        multiple = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] *= multiple;
            multiple *= nums[i];
        }

        return result;
    }
}