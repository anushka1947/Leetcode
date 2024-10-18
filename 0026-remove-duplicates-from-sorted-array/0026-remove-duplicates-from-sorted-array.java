class Solution {
    public int removeDuplicates(int[] nums) {
        //using Two pointers approach
        //i=track the position of last element
        //j=iterate over array
        int j=1;
        for(int i=1;i<nums.length;i++){
            //i=start from initialization and i-1 see the backword position 
            if(nums[i] != nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;



        
    }
}