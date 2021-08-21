class Solution {
    public boolean isPalindrome(String s) {
        
        int head =0;
        int tail = s.length()-1;
        
        while(head <= tail){
            char chead = s.charAt(head);
            char ctail = s.charAt(tail);
            
            if(!Character.isLetterOrDigit(chead)){
                head++;
            }else if(!Character.isLetterOrDigit(ctail)){
                tail--;
            }else{
                if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}