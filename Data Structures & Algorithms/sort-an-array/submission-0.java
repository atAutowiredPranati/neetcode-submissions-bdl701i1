class Solution {
    public int[] sortArray(int[] nums) {

//in my mind -
//traverse trough the  loop 1st time- take the first number
//compare it every number throughout the loop
//if the number is greater , then swap it with the index
//if not then or is equal to, then dont do anything

for(int i = 0 ; i < nums.length; i++){//5
    for(int j = i+1; j < nums.length; j++){//10, 2,1
        if(nums[i] > nums[j]){//5 > 10? 5>2?
            int temp = nums[i];//5
            nums[i] = nums[j];//2
            nums[j]= temp;//5
        }
    }
}
return nums;


        
    }
}
//5,10,2,1,3

//5,10,2,1,3
//2,10,5,1,3
//2,10,1,5,3
//2,10,1,3,5

//2,10,1,3,5
//2,1,10,3,5
//2,1,3,10,5
//2,1,3,5,10

//2,1,3,5,10
//1,2,3,5,10
