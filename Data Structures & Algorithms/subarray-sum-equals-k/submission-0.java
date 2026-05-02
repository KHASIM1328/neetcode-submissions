class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int res = 0;
        map.put(0, 1);

        for(int i=0; i<n; i++){
            currSum += nums[i];
            res += map.getOrDefault(currSum-k, 0);
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }

        return res;

    }
}