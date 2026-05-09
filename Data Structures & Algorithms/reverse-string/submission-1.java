class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length-1;

        reverseString(s, left, right);
        
    }

    private void reverseString(char[] s, int left, int right){
        if(left >= right){
            return;
        }

        char ch = s[left];
        s[left] = s[right];
        s[right] = ch;


        reverseString(s, left+1, right-1);

    }
}