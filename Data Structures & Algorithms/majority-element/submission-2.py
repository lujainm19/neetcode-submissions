class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        candidate = 0;
        for numbers in nums:
            if count == 0:
                candidate = numbers
                count = 1
            elif numbers == candidate:
                count+=1
            else:
                count-=1

        return candidate

        