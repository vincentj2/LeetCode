class Solution {
    public int majorityElement(int[] nums) {
        
        int answer =0;
        int n = nums.length;
        int time = n/2;
        
        Arrays.sort(nums);
        
        int temp =1;
        int target = nums[0];
        for(int i=1; i<nums.length; i++){
                if(target != nums[i]){
                    if(temp> time){
                        answer = target;
                        //temp =1;
                    }else{
                        target = nums[i];
                        temp =1;
                    }
                }else if(target == nums[i]){
                    temp +=1;
                }
        }
        if(temp > time){
            answer = target;
        }
        
        return answer;
        
    }
}