class Solution { //using bubble sort
    public void sortColors(int[] nums) {
        if (nums.length < 2){ // if less than 2 (1 or 0) numbers in array return the array itself
            return;
        }

        for (int i = 0; i < nums.length - 1; i++){ //outer loop for the amount of passes needed. how amny times have to go through array again and again until array fully sorted, 
            for (int j = 0; j < nums.length - i - 1; j++){ //inner loop for ever swap 
                if (nums[j] > nums[j+1]){
                    int temp = nums[j]; //store it in a temp varaible
                    nums[j] = nums[j+1]; //swapping
                    nums[j+1] = temp;
                }   
            }   
        }
        return; 
        
    }
}