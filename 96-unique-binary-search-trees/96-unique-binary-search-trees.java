class Solution {
    public int numTrees(int n) {
        
        int[] G = new int[n + 1];
        
        G[0] = 1; G[1] = 1; // init
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) { // sum
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];    
    }
}
/*
1차 풀이
- Timeout 발생
- 특정 값을 계산할때 계속해서 재귀가 발생하기 때문

class Solution {
    public int numTrees(int n) {
        
        if(n==0) return 1;
        if(n==1) return 1;
        
        int ans =0;
        
        for(int i=1; i<=n; i++){
            ans += numTrees(n-i) * numTrees(i-1);
        }
        
        return ans;        
    }
}*/