class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n; i++){
            int num = Math.abs(nums[i]) - 1;
            if(nums[num] > 0){
                nums[num] = -nums[num];
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }

        return res;
    }
}