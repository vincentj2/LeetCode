class Solution {
    public int maxSubArray(int[] nums) {
        //메모이제이션
        int max = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] >=0){
                nums[i] += nums[i-1];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        
        return max;
    }
}
