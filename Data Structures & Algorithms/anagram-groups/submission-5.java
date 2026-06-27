public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashmap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {//traverse through every string in the strs list
            String word = strs[i];
            char[] chars = word.toCharArray(); // converts string into a character array eg "cat" to {'c', 'a', 't'}, since In Java cannot directly sort a String.
            Arrays.sort(chars); //to sort the characters array 
            String key = new String(chars); //converts a char array back into a String and stores it variable called key

            if (!hashmap.containsKey(key)) {// if key not already in hashmap, add as new key
                hashmap.put(key, new ArrayList<>());
            }

            hashmap.get(key).add(word); //otherwise add the new word to the list already assigned to the key
        }

        return new ArrayList<>(hashmap.values());
    }
}
