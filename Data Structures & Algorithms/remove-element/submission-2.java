class Solution {
    public int removeElement(int[] nums, int val) {

        int j = -1;

        int n = nums.length;

        for(int i = 0; i<n; i++){
            if(nums[i] == val){
                j = i;
                break;
            }
        }

        if(j == -1){
            return n;
        }

        for(int i = j+1; i<n; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
        
    }
}