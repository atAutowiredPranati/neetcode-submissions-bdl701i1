class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String output = strs[0]; //[bag]

        for (String s : strs) {
            for (int j = 0; j < output.length() ; j++) {
                if (output.charAt(j) != (s.charAt(j))) {
                    output = output.substring(0,j);
                } 
            }
        }
        return output;
    }
}