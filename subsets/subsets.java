class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        Arrays.sort(nums);
        
        DFS(nums, result, subset, 0);
        
        return result;        
    }
    
    static private void DFS(int[] nums, List<List<Integer>> result, List<Integer> subset, int index){
        
        result.add(subset);
        for(int i=index; i<nums.length; i++){
            subset.add(nums[i]);
            DFS(nums, result, new ArrayList<>(subset), i+1);
            subset.remove(subset.size()-1);
        }
        
    }
}