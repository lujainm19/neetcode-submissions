class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Hashtable<Character, Integer> repetitionAtS = new Hashtable<>(); //store the letter and its count in the string
        for (int i=0; i < s.length(); i++){//traverse through s - 1st word
        char letter = s.charAt(i); //store the letter
            if (!repetitionAtS.containsKey(letter)) {
                int count = 1; //and update its count to 1
                for (int j=i+1; j < s.length(); j++){ //traverse through remaining letters in the string
                    if (s.charAt(j) == letter){ //if any of the remaining letters match, increment count of that letter
                    count++; 
                    }
                }
            repetitionAtS.put(letter, count);
            }
        }
       
    

        Hashtable<Character, Integer> repetitionAtT = new Hashtable<>(); //store the letter and its count in the string
        for (int i=0; i < t.length(); i++){//traverse through s - 1st word
        char letter1 = t.charAt(i); //store the letter
            if (!repetitionAtT.containsKey(letter1)) {
                int count1 = 1; //and update its count to 1
                for (int j=i+1; j < t.length(); j++){ //traverse through remaining letters in the string
                    if (t.charAt(j) == letter1){ //if any of the remaining letters match, increment count of that letter
                    count1++; 
                    }
                }
            repetitionAtT.put(letter1, count1);
            }
        }


    return repetitionAtS.equals(repetitionAtT);
        
    }
     public static void main(String[] args) {
        String w = "racecar";
        String x = "carrace";
        System.out.println("Output: " + isAnagram(w, x));

        String y = "jar";
        String z = "jam";
        System.out.println("Output: " + isAnagram(y,z));
    }
}

/**traverse through the word, create a hashtable store each char and its repetition with it, if the 
chars and their repitions match, the words are anagrams**/