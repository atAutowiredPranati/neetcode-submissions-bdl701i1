class Solution {
    public boolean hasDuplicate(int[] nums) {

        //if we have a duplicate number in an array then teuw 
        //return false

        //logic -> 
        //traverse through the array.
        //i0 -> i1 , i2, i3
        //i1 -> i2, i3
        //i2 -> i3
        //if lhs == value at i in rhs traverse == return true
        //return false

        //solution

        // for(int i = 0 ; i < nums.length; i++){
        //     for(int j = i+1 ; j < nums.length; j++){
        //         if (nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //approach 2 ->
        //sort it -> [1,2,3,3]
        //compare [i , i-1]
        //if nums[i] == nums[i-1] -> return true.
        //else false.

        //solution ->
    //     Arrays.sort(nums);
    //     for(int i = 1 ; i < nums.length; i++){
    //         if (nums[i] == nums[i-1]){
    //             return true;
    //         }
    //     }
    //     return false;
        
    // }

    // soltuion 2-> o(n)
    //Hashset because hashset stores single values only - no duplicate

    HashSet<Integer> mySet = new HashSet<>();
    for(int num : nums){
        if(mySet.contains(num)){
            return true;
        }
        mySet.add(num);
    }
    return false;
    }
}