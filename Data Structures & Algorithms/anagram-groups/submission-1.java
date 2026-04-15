class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //in my mind
        //if i sort of all the string = act, opst, opst, act, opst, aht.
        //but i will lose the real word after sorting.
        //so i have to save the real word and sorted word.
        //index does not matter here.
        //hashmap (sorted word , real word)

        //first approach.
        // traverse through the string
        //one variable - unsorted word 
        //one variable - sorted - take each index and sort it
        //create a hashmap <string , list<string>
        //check - if sorted word is available in key -> if yes then put the value of unsortedsorted index in the value
        //if not available - put the sorted word in key and unsorted word in value
        //return list of value of hashmap
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++){
            String unsortedWord = strs[i];
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            //now the chars is sorted so i will convert it into string
            String sortedWord = new String(chars);
            
            // if(map.containsKey(sortedWord)){
            //     map.get(sortedWord).add(unsortedWord);
            // } else {
            //     map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(unsortedWord);
            // }
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(unsortedWord);
        }
         return new ArrayList<>(map.values());
    }
}
