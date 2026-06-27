class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap ={}
        for word in strs: # to traverse through the strings in the array
                key = "".join(sorted(word)) # to sort the string and store it as the key

        # now continue traversing the list, check if key already exits, if yes append current word to 
        # its list if no, create new key and add current cord to its list
                if key in hashmap:
                    hashmap[key].append(word) # Add the current word to the existing list is key already exits
                else: 
                    hashmap[key] = [word] #otherwise Create a new list containing the current word.
        return list(hashmap.values())

'''
Create an empty hashmap
For each word:
    Sort the word
    Use the sorted word as the key
    If the key already exists:
        Append the word to that list
    Otherwise:
        Create a new list with the word
Return all the values from the hashmap as a list
'''

#traverse through the strings in the list, to sort every string
#which ever strings match group them togther 
# Use Map and use the sorted string as a "key" - so the value will be all the unsorted strings which match

