class Solution {
    public void reverseString(char[] s) {

        List<Character> myList = new ArrayList<>();
        for(char c : s){
            myList.add(c);
        }
        Collections.reverse(myList);
        int i = 0;
        while (i < s.length){
            s[i] = myList.get(i);
            i++;
        }
        
    }
}