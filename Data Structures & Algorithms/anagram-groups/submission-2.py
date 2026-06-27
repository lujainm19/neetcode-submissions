class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}

        for word in strs: # Traverse through every word in the input list

            count = [0] * 26 # Create a frequency array of size 26 (a-z)

            for char in word: # Count the frequency of each character
                index = ord(char) - ord('a')   # a -> 0, b -> 1, ..., z -> 25
                count[index] += 1

            key = tuple(count) # Convert the list to a tuple so it can be used as a dictionary key


            if key in hashmap:# Group the words
                hashmap[key].append(word)
            else:
                hashmap[key] = [word]

        return list(hashmap.values()) # Return all the grouped anagrams

# traverse through strings in list, create a list for each string or size 26, to store frequency of the characters
# match the words with same frequency