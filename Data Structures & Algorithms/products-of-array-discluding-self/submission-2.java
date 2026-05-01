class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int zeroCount = 0;
        int arrayProd = 1;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
            else{
                arrayProd *= nums[i];
            }
        }

        int[] output = new int[n];

        if(zeroCount == 0){
            for(int i = 0; i<n; i++){
                output[i] = arrayProd / nums[i];
            }
        }
        else if(zeroCount == 1){
            for(int i=0; i<n; i++){
                if(nums[i] == 0){
                    output[i] = arrayProd;
                }
                else{
                    output[i] = 0;
                }
            }
        }
        else{
            for(int i=0; i<n; i++){
                output[i] = 0;
            }
        }

        return output;
    }
}  
