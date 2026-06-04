class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String output = strs[0]; //[bag]
        String last = strs[n-1];

            for (int j = 0; j < output.length() ; j++) {
                if (output.charAt(j) != (last.charAt(j))) {
                    output = output.substring(0,j);
                } 
            }
        return output;
    }
}