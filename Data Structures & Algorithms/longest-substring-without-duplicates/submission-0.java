class Solution {
    public int lengthOfLongestSubstring(String s) {

        // in my mind ->
        //take a sack and traverse through the string.
        //check if you have seen this character 
        //if no then add it to your sack
        //if yes then empty the sack
        //and a note how many element you had in your sack before you removed everything
        //the time when you had max num of elements in your sack was the longest substring.

        //logic ->
        //convert the string into an array for seemless traversions.
        //add all upcoming element into a map because you can compare if you have that element.
        //map<character , integer> - char = string , integer = index
        //while traversing check if map has this key (keys cant be duplicate)
        //if yes - check the value(i) of this key(string)  and start a fresh count
        //if no - add it to the map

        //solution ->
        //pwwkew
        char[] arr = s.toCharArray(); // p , w , w , k , e , w
        int left = 0;
        int maxlength = 0;
        HashMap<Character , Integer> window = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){ 
            if(window.containsKey(arr[i])){// p?=x, w?=x, w?=Y k?=
                left = Math.max(left, window.get(arr[i]) + 1);
            }
            window.put(arr[i], i);//p,0 w,1  

                maxlength = Math.max(maxlength,i - left + 1);
              

            }
        

        return maxlength;
        
    }
}
