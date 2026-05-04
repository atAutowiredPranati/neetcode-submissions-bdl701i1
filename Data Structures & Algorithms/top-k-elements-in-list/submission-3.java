class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //on my mind
        //map -> key = numbers , values = frequency
        //arr of int[] - 2d array
        //1st i - frequency , 2nd i - number
        //sort the array -> greatest frequency comes first
        //traverse through the array i
        //take out the number of that frequency (1st index of that array)

        Map<Integer , Integer> myMap = new HashMap<>();
        for(int num : nums){
            myMap.put(num , myMap.getOrDefault(num , 0)+1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : myMap.entrySet()){
            arr.add(new int[] {entry.getValue() , entry.getKey()});
        }
        arr.sort((a , b) -> b[0] - a[0]);
        int[] res = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i] = arr.get(i)[1];
        }
        return res;


        
    }
}
