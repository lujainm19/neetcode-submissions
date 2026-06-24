class Solution {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                int sum = nums[i] + nums[j]; //add to get sum of every pair of numbers in the array
                int[] indexPair = {i, j}; //create an array to store the indexes of the pairs that were added
                if (sum == target){ //as soon as the target given is equal to the sum of the added pairs, the pairs index stored is returned
                    return indexPair;
                }
            }
        }
        return new int[]{};
    }

    public static void main (String[] args){
        int [] nums1 = {3, 4, 5, 6};
        int target1 = 7;
        System.out.println("Output: " + twoSum(nums1, target1));

        int [] nums2 = {4, 5, 6};
        int target2 = 10;
        System.out.println("Output: " + twoSum(nums2, target2));

        int [] nums3 = {5, 5};
        int target3 = 10;
        System.out.println("Output: " + twoSum(nums3, target3));
        
    }
}
