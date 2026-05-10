class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        int[] res = new int[n];

        int left = 0;
        int right = n-1;
        int ind = n-1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare < rightSquare) {
                res[ind] = rightSquare;
                ind--;
                right--;
            }
            else{
                res[ind] = leftSquare;
                ind--;
                left++;
            }
        }

        return res;
        
    }
}