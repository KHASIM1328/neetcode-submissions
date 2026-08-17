class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> res = new HashMap<>();

        for(String str : strs){
            int[] alp = new int[26];
            for(int i = 0; i<str.length(); i++){
                alp[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(alp);

            if(!res.containsKey(key)){
                List<String> curr = new ArrayList<>();
                curr.add(str);
                res.put(key, curr);
            }
            else{
                res.get(key).add(str);
            }
        }

        return new ArrayList<>(res.values());
        
    }
}
