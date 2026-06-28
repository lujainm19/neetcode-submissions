class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; //variable declared to count numbers != val 
        for  (int i = 0; i < nums.length; i++){ //traverse through array
            if (nums[i] != val){ // if the current number looking does not = val
                nums[k] = nums[i]; //keep that number (k is like the 2nd pointer) 
                k++; //increment count of k 
            }
        }
        return k;
    }
}