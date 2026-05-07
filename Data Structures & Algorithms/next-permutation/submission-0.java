class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int j = -1;

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                j = i;
                break;
            }
        }

        if(j==-1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i = n-1; i>j; i--){
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                reverse(nums, j+1, n-1);
                return;
            }
        }
        
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}