class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //in my mind
        //traverse through the array and sortt each string
        //strs = [act,opst,opst,act,opst,aht]
        //map - where key = string , value = index 
        //{(act, 0,3)
        //(opst , 1,2,4)
        //(aht,5)}
        //traverse through the map and group similar value together in an array.

        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i++){
            String unSortedWord = strs[i];
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String (chars);

            map.computeIfAbsent(sortedWord , k -> new ArrayList<>()).add(unSortedWord);
        }
        return new ArrayList<>(map.values());
    }

}
