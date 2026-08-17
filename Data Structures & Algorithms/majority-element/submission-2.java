class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int count = 0;
        int currEle = -1;

        for(int i = 0; i<n; i++){
            if(count == 0){
                currEle = nums[i];
            }
            if(currEle == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        return currEle;
        
    }
}