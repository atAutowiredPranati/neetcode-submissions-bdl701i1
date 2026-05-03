class Solution {
    public int majorityElement(int[] nums) {

        //on my mind 
        //majority element will alsways come in n/2 position
        //sort the array
        //fetch the n/2th index

        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
        
    }
}