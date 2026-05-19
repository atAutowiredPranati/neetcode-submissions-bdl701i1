class Solution {
    public void reverseString(char[] s) {

        List<Character> myList = new ArrayList<>();
        for(char c : s){
            myList.add(c);
        }

        Collections.reverse(myList);

        for(int i = 0 ; i < s.length; i++){
            s[i] = myList.get(i);
        }



        
    }
}