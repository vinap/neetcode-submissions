class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseInput = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start = 0;
        int end = lowerCaseInput.length()-1;
        while(start<end){

            if(lowerCaseInput.charAt(start)!=(lowerCaseInput.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
