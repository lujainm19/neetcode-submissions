class Solution {
    public static boolean hasDuplicate(int[] nums) {
        for (int i=0; i < nums.length; i++){
            int val1 = nums[i];
            for (int j=i+1; j < nums.length; j++) {
                int val2 = nums[j];
                if (val1 == val2){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int [] nums1 = {1, 2, 3, 3};
        System.out.println("Output: " + hasDuplicate(nums1));

        int [] nums2 = {1, 2, 3, 4};
        System.out.println("Output: " + hasDuplicate(nums2));
    }
}