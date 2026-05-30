class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        Map<Integer, Integer> presence = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(presence.containsKey(target - nums[i])){
                return new int[]{presence.get(target-nums[i]), i};
            }

            presence.put(nums[i], i);
        }

        return new int[]{-1, -1};
        
    }
}
