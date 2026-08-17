class Solution {
    public boolean isAnagram(String s, String t) {

        int[] alph = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i<s.length(); i++){
            alph[s.charAt(i) - 'a']+=1;
            alph[t.charAt(i) - 'a']-=1;
        }

        for(int num : alph){
            if(num != 0){
                return false;
            }
        }

        return true;

    }
}
