class Solution:
    def sortColors(self, nums: List[int]) -> None:
        red = 0
        white = 0
        blue = 0
        length = len(nums)

        for num in nums:
            if num == 0:
                red+=1
            elif num == 1:
                white +=1
            else:
                blue +=1

        i = 0

        while red > 0:
            nums[i] = 0
            i += 1
            red -= 1

        while white > 0:
            nums[i] = 1
            i += 1
            white -= 1

        while blue > 0:
            nums[i] = 2
            i += 1
            blue -= 1
