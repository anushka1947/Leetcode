class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[]sol=new int[n];
        int a=0;


        for(int num : nums){
            if(num < pivot){
                sol[a++]=num;
            }
        }
        for(int num : nums){
            if(num == pivot){
                sol[a++]=num;
            }
        }    
        for ( int num:nums){
            if(num > pivot){
                sol[a++]=num;
            }
        }
        return sol;
        
    }
}