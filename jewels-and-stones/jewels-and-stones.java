class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashMap<String, Integer> stone = new HashMap<>();
        Set<String> jewel = new HashSet<>();
        
        String[] array = jewels.split("");
        String[] array2 = stones.split("");
        
        int ans =0;
        
        for(int i=0; i<array.length;i++){
            jewel.add(array[i]);
        }
        
        for(int i=0; i<array2.length;i++){
            if(!stone.containsKey(array2[i])){
                stone.put(array2[i],1);
            }else{
                stone.put(array2[i],stone.get(array2[i])+1);
            }
        }
        
        for(String str : jewel){
           if(stone.containsKey(str)){
                ans += stone.get(str);    
            } 
        }
        return ans;
        
    }
}