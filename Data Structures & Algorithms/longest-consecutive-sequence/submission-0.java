class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        int res = 0;
        int count = 0;

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(!set.contains(num-1)){
                count = 1;
                while(set.contains(num+1)){
                    num++;
                    count++;
                }
                res = Math.max(count, res);
            }

        }

        return res;

    }
}
