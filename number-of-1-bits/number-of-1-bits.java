public class Solution {
    public int hammingWeight(int n) {
        int cnt =0;
        for(int i=0; i<32; i++){
            int flag = n & 1;
            if(flag>0){
                cnt++;
            }   
            n = n >> 1;
        }
        return cnt;        
    }
}