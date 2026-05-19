class Solution {
    public void reverseString(char[] s) {

        Stack<Character> myStack = new Stack<>();
        for(char c : s){
            myStack.push(c);
        }

        for(int i = 0 ; i < s.length ; i++){
            s[i] = myStack.pop();
        }
        
    }
}