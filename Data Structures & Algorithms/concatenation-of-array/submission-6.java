class Solution {
    public int[] getConcatenation(int[] nums) {

        //in my mind
        //traverse through the array nums
        //create an array ans of 2nums length
        //traverse through the array ans
        //through the first nums.length traversion -> ans[i] == nums[i]
        //after that ans[i] = nums[i]

        int n = nums.length;
        int[] ans = new int[2*nums.length];

        for(int i = 0 ; i < n ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];

        }
        return ans;
        
    }
}