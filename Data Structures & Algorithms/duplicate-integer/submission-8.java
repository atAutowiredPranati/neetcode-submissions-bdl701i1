class Solution {
    public boolean hasDuplicate(int[] nums) {

        //in my mind -

        //traverse through the array , check if i have seen this number if yes then do nothing but return true.
        //if no then continue.

    //     if(nums.length != 0){
    //     HashSet<Integer> set = new HashSet<Integer>();
    //     for(int i = 0 ; i < nums.length; i++){
    //         if(set.contains(nums[i])){
    //             return true;
    //         } else {
    //             set.add(nums[i]);
    //         }
    //     }       
    // }
    //  return false;//took 5 mins 9 seconds without help.

    //APPROACH =2

    // we sort the elements and we see that i + 1 != i-> true

//     Arrays.sort(nums);
//     if(nums.length != 0){
//     for(int i = 1 ; i < nums.length ; i++){
//         if(nums[i] == nums[i-1]){
//             return true;
//         }
//     }
//   }
//   return false; //took 3 mins 40 seconds without help.

    //APPROACH -3

    if(nums.length != 0){
    for(int i = 0 ; i < nums.length; i++){
        for(int j = i+1 ; j < nums.length; j++){
            if(nums[i] == nums[j]){
                return true;
            }
        }
    }
    }
    return false; //took 3 mins 35 seconds and saw the solution because i was feeling lazy.


}
} 