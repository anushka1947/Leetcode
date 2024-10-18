class Solution {
    public int removeDuplicates(int[] nums) {
        //using two pointers approach
        // Edge case: if the array has less than two elements, return   the length
        /*if (nums.length <= 2) {
            return nums.length;
        }*/

        int j=2;
        for(int i=2;i< nums.length;i++){
            if(nums[i] != nums[j-2]){
                nums[j]=nums[i];
                j++;
            }

        }
        return j;
        
    }
}