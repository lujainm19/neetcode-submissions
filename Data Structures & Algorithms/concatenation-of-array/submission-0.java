class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n*2]; //ans array created with double size of o.g. array
    for (int i = 0; i < n; i++){ //traverse through og array
        ans[i] = nums[i];
        ans[i+n] = nums[i];
    }
        return ans;
    }

    public static void main(String[] args){
        int [] nums1 = {1, 4, 1, 2};
        System.out.println("Output: " + getConcatenation(nums1));

        int [] nums2 = {22, 21, 20, 1};
        System.out.println("Output: " + getConcatenation(nums2));
    }
}