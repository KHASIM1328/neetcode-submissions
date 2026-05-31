class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ind = m + n -1;

        while(m > 0 && n > 0){
            if(nums1[m-1] < nums2[n-1]){
                nums1[ind] = nums2[n-1];
                ind--;
                n--;
            }else{
                nums1[ind] = nums1[m-1];
                ind--;
                m--;
            }
        }

        while(n > 0){
            nums1[ind] = nums2[n-1];
            ind--;
            n--;
        }
        
    }
}