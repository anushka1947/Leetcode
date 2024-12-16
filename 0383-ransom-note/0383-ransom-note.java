class Solution {
    public boolean canConstruct(String string1, String string2) {
        if(string1.length()>string2.length())
        return false;
        int[]alphabets_counter=new int[26];

        for(char c:string2.toCharArray())
            alphabets_counter[c-'a']++;

        for(char c:string1.toCharArray()){
            if (alphabets_counter[c-'a']==0)
            return false;
            alphabets_counter[c-'a']--;
        }
        return true;
             

        
    }
}