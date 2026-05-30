class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] parArr = new int[26];
            for(char ch : str.toCharArray()){
                parArr[ch-'a']++;
            }

            String key = Arrays.toString(parArr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
