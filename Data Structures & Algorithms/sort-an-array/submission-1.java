class Solution {//merge sort
    public int[] sortArray(int[] nums) {
        if (nums.length < 2){ // if less than 2 (1 or 0) numbers in array return the array itself
            return nums;
        }
        int mid = nums.length/2; //mid is half
        int[] left = new int[mid]; // new array created to hold left half of the og array
        int[] right = new int[nums.length - mid]; // new array created to hold right half of the og array 

        for (int i = 0; i < mid; i++){ //copy left half elements into new left array
            left[i] = nums[i];
        }
        
        for (int i = mid; i < nums.length;  i++){ //copy right half elements into new right array
            right[i - mid] = nums[i];
        }

        sortArray(left); //recursive call to Sort the left half itself using the exact same Merge Sort algorithm above until 1 element remaining
        sortArray(right); //recursive call to Sort the right half itself using the exact same Merge Sort algorithm above until 1 element remaining

        merge(nums, left, right); //merge 
        return nums; //to finally return the fully sorted array
    }

    public void merge (int[] nums, int[] left, int[] right){
        int i = 0; //left
        int j = 0; //right
        int k = 0; //nums[]
        while (i < left.length && j < right.length) { //Keep comparing elements as long as both arrays still have elements left
            if (left[i] <= right[j]){ //if left number is less than right number
                nums[k++] = left[i++]; // nums[k] = left[i]; and i++; and k++; so put lefts number in nums, i++ moves the left pointer to go to next left number, k++ moves where the next number will be written.
            } else { //if left number is less than right number
                nums[k++] = right[j++]; // nums[k] = right[j]; and j++; and k++;
            }
        } 
        while (i < left.length){ //If the left array still has elements, copy all of them
            nums[k++] = left[i++]; 
        } 
        while (j < right.length){ //If instead the right array had leftover numbers, copy them
            nums[k++] = right[j++];
        }
    }
}