class Solution {
    public int lengthOfLastWord(String s) {

        int n = s.length();

        int count = 0;
        int endSpace = 0;

        for(int i = n-1; i>=0; i--){
            while(endSpace == 0 && s.charAt(i) == ' '){
                i--;
            }
            endSpace = 1;
            if(i>=0 && s.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }

        }

        return count;
        
    }
}