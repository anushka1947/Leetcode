import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the array is null or empty
        if (strs == null || strs.length == 0) return "";

        // Sort the array lexicographically
        Arrays.sort(strs);

        // Compare the first and last strings in the sorted array
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;

        // Find the common prefix between the first and last strings
        while (index < first.length() && index < last.length() &&
               first.charAt(index) == last.charAt(index)) {
            index++;
        }

        // Return the common prefix
        return first.substring(0, index);
    }
}
