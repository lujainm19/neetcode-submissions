class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;//initaialize count
        int candidate = 0; //intialize candidate
        for (int i = 0; i < nums.length; i++){ //traverse through the array
            if (count == 0){ //if the count of element currently at is 0, set it as canditate and update count to 1
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) { //otherwise if current element at = candidiate increment count
                count++;
            } else { // otherwise if current element != candidate decrement count, to see how which element/candidate survives all the decrements
                count--;
            }
        }
    return candidate;    
    }
}

/* save 1st element traverse through array keep count of its reoccrence, same for rest use Map and then 
        see which is greater than n/2

        or

        traverse and store first number as candidate and starting tracking its count, “Who survives all cancellations?”
         lastly check its the candidates
        count is greater than n/2 
        **/