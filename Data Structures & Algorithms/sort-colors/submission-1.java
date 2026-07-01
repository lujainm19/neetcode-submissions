class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                red++; //increment count of red
            }
            else if (nums[i] == 1){
                white++; //increment count of white
            }
            else if (nums[i] == 2){
                blue++; //increment count of blue
            }
        }

        int i = 0;
        while (red > 0) { // decrement count of red and write 0's in nums until count of red is 0
            nums[i] = 0;
            i++;
            red--;
        }
        while (white > 0){ // decrement count of white and write 1's in nums until count of white is 0
            nums[i] = 1;
            i++;
            white--;
        }
        while (blue > 0){ // decrement count of bluw and write 2's in nums until count of blue is 0
            nums[i] = 2;
            i++;
            blue--;
        }    
    }
}