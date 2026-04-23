class Solution {
    public int[] sortArray(int[] nums) {

        //on my mind
        //traverse throigh the array once and pick the value of i1
        //traverse through it twice and go through every i
        //if i > j (j starts from i+1)
        //swap value of index i with value of index j
        //else do nothing

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){//10, 2 , 2 > 1?
                if(nums[i] > nums[j]){// 5 > 10 , 5 > 2? => swap
                    int temp = nums[i];//5 - 2
                    nums[i] = nums[j];
                    nums[j] = temp;
                } 
            }
        }
        return nums;
        
    }
}