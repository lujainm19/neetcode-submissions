public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashmap = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!hashmap.containsKey(key)) {
                hashmap.put(key, new ArrayList<>());
            }

            hashmap.get(key).add(word);
        }

        return new ArrayList<>(hashmap.values());
    }
}
