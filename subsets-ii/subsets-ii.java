class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        Arrays.sort(nums);
        DFS(nums,result,subset,0);
        return result;
    }
    
    static private void DFS(int[] nums, List<List<Integer>> result, List<Integer> subset, int index){
        result.add(new ArrayList<>(subset));
        
        for(int i= index; i<nums.length;i++){
            //중복 제거
            if(i != index && nums[i] == nums[i-1]) continue;
            
            subset.add(nums[i]);
            DFS(nums,result,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
}