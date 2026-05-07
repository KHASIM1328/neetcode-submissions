class Solution {
    public int maxAscendingSum(int[] nums) {

        int maxSum = nums[0];

        int currSum = maxSum;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                currSum+=nums[i];
                maxSum = Math.max(maxSum, currSum);
            }
            else{
                currSum = nums[i];
            }
            
        }

        return maxSum;
        
    }
}