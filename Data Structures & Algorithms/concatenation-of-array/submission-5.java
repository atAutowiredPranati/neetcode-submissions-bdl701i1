class Solution {
    public int[] getConcatenation(int[] nums) {

        //in my mind -
        //we have two arrays, nums - n , ans - 2n.
        // n indexes will repeat in ans after the filling of n indexes.
        //in one array we have to repeat nums twice.

        // int[] ans = new int[2*nums.length];
        // int index = 0;
        // for(int i = 0 ; i < 2 ; i++){
        //     for(int num: nums){
        //         ans[index++] = num;
        //     }
        // }  
        // return ans;    

        //SOLUTION -2
        //if we wantr to remove traversing through the method two times and we want to make just one for loop.
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i = 0 ; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }  
        return ans;
    }
}