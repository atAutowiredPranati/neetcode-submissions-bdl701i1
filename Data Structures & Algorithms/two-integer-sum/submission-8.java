class Solution {
    public int[] twoSum(int[] nums, int target) {

       //in my mind
       // take 7 and minus each element of the array with that 7-3 =4
       // i will save the difference in hashmap 4 as key and index as value
       // i will check the next number , if that number is present in my map, then i will fetch
       //the value of the key of that number.
       //that will be my one of the index and i will be second index.

        int difference = 0;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){

             difference = target - nums[i];
             if (map.containsKey(difference)){//4 - yes
                return new int[]{map.get(difference) , i};
             }
             map.put(nums[i] ,i);//4,0
             

        }
        return new int[]{};
    }
}
