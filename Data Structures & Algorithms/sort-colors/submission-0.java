class Solution {
    public void sortColors(int[] nums) {

        for(int i = 0 ; i < nums.length; i++){//5
    for(int j = i+1; j < nums.length; j++){//10, 2,1
        if(nums[i] > nums[j]){//5 > 10? 5>2?
            int temp = nums[i];//5
            nums[i] = nums[j];//2
            nums[j]= temp;//5
        }
    }
}
        
    }
}