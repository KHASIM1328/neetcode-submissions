class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int total = 0;

        Map<Integer, Integer> reminderMap = new HashMap<>();
        reminderMap.put(0, -1);

        for(int i=0; i<n; i++){
            total+=nums[i];

            int rem = total % k;

            if(!reminderMap.containsKey(rem)){
                reminderMap.put(rem, i);
            }
            else if(i - reminderMap.get(rem) > 1){
                return true;
            }
        }

        return false;
    }
}