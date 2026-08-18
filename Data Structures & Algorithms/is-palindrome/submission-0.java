class Solution {
    public boolean isPalindrome(String s) {
        
        String sAlpha = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0; i < sAlpha.length(); i++){
            if(sAlpha.charAt(i) != sAlpha.charAt(sAlpha.length() - i - 1)){
                return false; 
            }
        }
        return true;

    }
}
