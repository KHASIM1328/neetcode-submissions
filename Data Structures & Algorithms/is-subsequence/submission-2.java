class Solution {
    public boolean isSubsequence(String s, String t) {

        int n = s.length();
        int m = t.length();

        if(s.length() == 0){
            return true;
        }

        int ind = 0;

        for(int i=0; i<m; i++){
            if(t.charAt(i) == s.charAt(ind)){
                ind++;
            }
        }

        return (n == ind);
        
    }
}