class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];
        int ind = nums.length-1;

        int l = 0;
        int r = nums.length-1;

        while(l <= r){
            if((nums[l] * nums[l]) > (nums[r] * nums[r])){
                res[ind] = nums[l]*nums[l];
                ind--;
                l++;
            }
            else{
                res[ind] = nums[r]*nums[r];
                ind--;
                r--;
            }
        }

        return res;
        
    }
}