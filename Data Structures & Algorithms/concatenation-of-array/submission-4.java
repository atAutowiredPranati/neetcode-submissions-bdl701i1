class Solution {
    public int[] getConcatenation(int[] nums) {

        //in my mind
        //ans = 2nums -> length comparison
        //first n-1 elements of nums = first nums.length-1 elements of ans.
        //[1,2,3] = [1,2,3,1,2,3] - concat

        //logic
        //create an array ans of length 2n.
        
        int n = nums.length;
        int[] ans = new int [n*2];

        for(int i = 0 ; i < n ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
        
    }
} // 10 mins with a bit help