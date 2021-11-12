class Solution {
    public int majorityElement(int[] nums) {
        
        int answer =0;
        int time = nums.length/2;
        
        Arrays.sort(nums);
        
        int temp =1;
        int target = nums[0];
        for(int i=1; i<nums.length; i++){
                if(target != nums[i]){
                    if(temp > time){
                        return target;
                    }else{
                        target = nums[i];
                        temp =1;
                    }
                }else if(target == nums[i]){
                    temp +=1;
                }
        }
        if(temp > time) return target;
        return answer;     
    }
}