class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        List<Integer> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            int ind = Math.abs(nums[i]) - 1;

            if(nums[ind] > 0){
                nums[ind] = -nums[ind];
            }
        }

        for(int i =0; i<n; i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        
        return res;
    }
}