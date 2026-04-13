class Solution {
    public String longestCommonPrefix(String[] strs) {
        //brute approach ->
        // in my mind:
        //I want to traverse throgh strs and take each char of each index and compare with the first index word
        // that i have named as result initially.
        //once i compare if some char does not match then i remove that from my initial suspected result.
        //for this i want traverse once through whole strs then one by one i want  to traverse through eahc index.

        //rough logic-
        //let the first index by=e final result.
        //loop through strs
        //loop through the first index
        //if first index first word == final result first word -> continue
        //continue till the length of first word.
        //if the first word unmatches in between then remove the word that is being traverse form the finalresult.

        String output = strs[0];//bat
        for(int i = 1 ; i < strs.length; i++){
            //at this point we have two words = bat , bag.
            //now we have to compare them.
            String temp = strs[i];//bag
            int j = 0;
            while (j < output.length() && j < temp.length()) {
                if (output.charAt(j) == temp.charAt(j)) {
                    j++;
                } else {
                    break;
                }
            }
            output = output.substring(0, j);
        }
        return output;

    }
}