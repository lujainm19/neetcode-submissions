class Solution {
    public static String longestCommonPrefix(String[] strs) {

        String prefix = ""; // to store the matched characters, and return empty in case nom matched characters
        for (int j = 0; j < strs[0].length(); j++) {//traverse through 1st string in array
            char currentChar = strs[0].charAt(j); //get characters of the 1st string

            for (int i = 1; i < strs.length; i++) { //traverse through all other strings in array
            // prevent StringIndexOutOfBoundsException
                if (j >= strs[i].length()) {
                    return prefix;
                }
                char currentChar1 = strs[i].charAt(j); //get characters of all other Strings
                if (currentChar != currentChar1) {  //for as long as characters of all strings match
                    return prefix; //return stored same characters
                }
            }
        prefix += currentChar;//add characters that are matched to prefix string
        }
    return prefix;
    }

    public static void main(String[] args){
        String[] strs1 = {"bat", "bag", "bank", "band"};
        System.out.println("Output: " + longestCommonPrefix(strs1));

        String[] strs2 = {"dance","dag","danger","damage"};
        System.out.println("Output: " + longestCommonPrefix(strs2));

        String[] strs3 = {"neet","feet"};
        System.out.println("Output: " + longestCommonPrefix(strs3));
    }
}