class Solution {
    public int maxSubArray(int[] nums) {
        int maxIterate = nums[0];
        int maxCount = nums [0];
        for (int i = 1 ; i < nums.length ; i++){
            maxIterate =Math.max (nums[i], maxIterate + nums[i]);
            maxCount = Math.max ( maxIterate ,maxCount);
        }
        return maxCount ;
        
    }
}