class Solution {
    public int[] twoSum(int[] nums, int target) {

        //0i -> 1i, 2i, 3i
        //1i -> 2i , 3i 
        //2i -> 3i
        //two loop traversions -> LHS , RHS.
        //LHS will be the first major loop , inside which RHS will complete first.
        //not repeat the traversions.

        //logic ->
        //loop (indexes from 0i to arr.length -1i){
        //loop (loop1i +1 arr.length -1 ){
        // if loop 1 index + loop 2 index = target -> return an array[loop1 index , loop 2 index]
        // }continue;
        //}
        //

        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i+1; j < nums.length ; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;

        //Second Approach :
        // Hashmap -> O(n)
        //target - nums[i] = difference.// 7 - 3 = 4 
        //find pair of 4 (7-4 ) = 3
        //store 4 and its index number as value in map. ( difference, index)
        // when we find the pair of 4 (7-4 = 3) in traversion then we take the index of 3.
        
        //logic -
        //Map
        //traverse through the iteration once. O(n)
        //difference = target - value at i
        //if i have the difference stored at my map 
        // return index of diference, index of i that is traversing
        //store this current i with its value

        HashMap<Integer, Integer> storeMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
        int difference = target - nums[i];
        if(storeMap.containsKey(difference)){
            return new int[] {storeMap.get(difference), i};
        }
        storeMap.put(nums[i], i);

        }
        return null;
    }
}
