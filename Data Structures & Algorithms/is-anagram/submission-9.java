class Solution {
    public boolean isAnagram(String s, String t) {
        //anagram - racecar , carrace
        //sort the strings and compare the length, is same then go ahead , if nont the immediately rerurn false
        //if same ->
        //comparison of strings.

        // char[] arrayS = s.toCharArray();
        // char[] arrayT = t.toCharArray();

        // if(arrayS.length != arrayT.length){
        //     return false;
        // }
        // Arrays.sort(arrayS);
        // Arrays.sort(arrayT);
        // return Arrays.equals(arrayS , arrayT);

        //on my mind
        //solution 2 : if we go via hashmap
        //hashmap (key, value)
        //key : character , value - repetition
        //store 

        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> sMap = new HashMap<>();
        HashMap<Character , Integer> tMap = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            //s.put(index , the number of times that char has appeared)
            sMap.put(s.charAt(i) , sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i) , tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sMap.equals(tMap);


    }
}
