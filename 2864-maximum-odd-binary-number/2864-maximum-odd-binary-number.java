class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onesCount =0  , ZerosCount = 0;
        for(char ch : s.toCharArray ()){
            if(ch == '1') onesCount ++;
            else ZerosCount ++;
        }
        StringBuilder result = new StringBuilder();
        for (int i =0; i< onesCount -1 ;i++){
            result.append ('1');
        }
        for (int i = 0; i<ZerosCount ;i++){
            result.append('0');
        }
        result.append ('1');
        return result.toString ();
    }
}