class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];

        for (int i = n - 1, j = 0; i >= 0 ; j++, i--) {
            temp[j] = s[i];
        }
        for (int j = 0; j < n; j++) {
            s[j] = temp[j];
        }
    }
}