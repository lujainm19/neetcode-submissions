class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0 #variable declared to count numbers != val 

        for numbers in nums: #or for i in range(len(nums)): to traverse through array
            if numbers != val: #if the current number looking does not = val
                nums[k] = numbers # indexing is in [] brackets
                k += 1 #increment count of k 
        
        return k       
       
       
       
       
 