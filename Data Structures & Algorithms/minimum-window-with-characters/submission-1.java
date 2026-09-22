class Solution {
    public String minWindow(String s, String t) {

        if(t.length() > s.length()){
            return "";
        }

        int left = 0;
        
        Map<Character, Integer> need = new HashMap<>();
        for(char ch : t.toCharArray()){
            need.put(ch, need.getOrDefault(ch, 0)+1);
        }
        int required = need.size();

        Map<Character, Integer> window = new HashMap<>();

        int formed = 0;

        int minLen = Integer.MAX_VALUE;
        
        int minLeft = 0;

        for(int right = 0; right < s.length(); right++){

            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0)+1);

            if(need.containsKey(ch) && window.get(ch).intValue() == need.get(ch)){
                formed++;
            }

            while(left <= right && formed == required){
                if(minLen > right-left+1){
                    minLen = right-left+1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar)-1);

                if(need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)){
                    formed--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft+minLen);
        
    }
}
