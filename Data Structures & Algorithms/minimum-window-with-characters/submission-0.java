class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()){
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();

        for(char ch : t.toCharArray()){
            need.put(ch, need.getOrDefault(ch, 0)+1);
        }

        int required = need.size();

        int formed = 0;

        int left = 0;

        Map<Character, Integer> window = new HashMap<>();

        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;


        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0)+1);

            if(need.containsKey(ch) && window.get(ch).intValue() == need.get(ch)){
                formed++;
            }

            while(left <= right && formed == required){

                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar)-1);

                if(need.containsKey(leftChar) && need.get(leftChar) > window.get(leftChar)){
                    formed--;
                }
                left++;
            }
        }

        return minLen==Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft+minLen);

        
    }
}
