class Solution {
    public String reverseWords(String s) {
        //Remove Trailling and leading spaces and split also
        //reverse the string
        // Maintain a proper gap if it is not a last element
        //Return the result
        String[] words = s.trim().split("\\s+");

        StringBuilder reversed =new StringBuilder();
        for(int i = words.length -1 ; i>=0 ; i--){
            reversed.append(words[i]);


            if(i != 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();

    }
}