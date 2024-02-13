class Solution {
    public String firstPalindrome(String[] words) {

        for(String word : words) {
            if(isPalidrome(word)) return word;
        }
        
        return "";
    }
    
    static boolean isPalidrome(String word) {
        
        char[] characters = word.toCharArray();
        
        for(int i=0; i<characters.length/2; i++){
            if(characters[i] !=(characters[characters.length - i -1])){
                return false;
            }
        }
        return true;
    }
}