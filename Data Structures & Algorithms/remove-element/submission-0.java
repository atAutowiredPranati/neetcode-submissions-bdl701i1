class Solution {
    public int removeElement(int[] nums, int val) {

        //in my mind
        //traverse through the array and check if the index value = val we wanna skip it to store it
        //if it is not equal to val then good - store it starting from 0th position. and increment 0th position everytime.

        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(val != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        
    }
}