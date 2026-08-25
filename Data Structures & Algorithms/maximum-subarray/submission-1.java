class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;

        int sum = 0;
        for (int i= 0; i< nums.length ; i++){
            sum += nums[i];
            ans = sum < ans ? ans : sum;
            sum = sum < 0? 0 : sum;
        }

        return ans;
    }
}