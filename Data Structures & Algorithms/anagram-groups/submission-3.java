class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //on my mind
        //traverse through the array
        //convert each i into array of char
        //sort each index
        //act,opst,opst,act,opst,aht
        //create a map(string , list<String>)
        //key = sorted value of strs[i]
        //value = list of unsorted value of strs[i]
        //return 

        Map<String , List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++){//act
            char[] charArray = strs[i].toCharArray();//[a,c,t]
            Arrays.sort(charArray);//[a,c,t]
            String sortedString = new String(charArray);
            map.putIfAbsent(sortedString , new ArrayList<>());
            map.get(sortedString).add(strs[i]);
        }
        return new ArrayList<>(map.values());


    }
}
