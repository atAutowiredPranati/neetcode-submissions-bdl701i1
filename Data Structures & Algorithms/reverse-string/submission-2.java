class Solution {
    public void reverseString(char[] s) {

        Stack<Character> myStack = new Stack<>();
        for(char c : s){
            myStack.push(c);
        }
        int i = 0;
        while(!myStack.isEmpty()){
            s[i++] = myStack.pop();
        }
        
    }
}