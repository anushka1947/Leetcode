class Solution {
    public int majorityElement(int[] nums) {
        //using Sorthing approach
        Arrays.sort(nums);
        int n =nums.length;
        return nums[n/2];
        
    }
}