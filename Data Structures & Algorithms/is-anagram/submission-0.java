class Solution {
    public boolean isAnagram(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2){
            return false;
        }

        int[] letters = new int[26];

        for(int i=0; i<n1; i++){
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++){
            if(letters[i] != 0){
                return false;
            }
        }

        return true;

    }
}
