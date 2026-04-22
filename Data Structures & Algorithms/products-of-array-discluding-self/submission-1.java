class Solution {
    public int[] productExceptSelf(int[] nums) {

        //on my mind
        //brute force -> 
        //traverse through the array -1
        //take the index i and set it to 1
        //traverse through the remaining array i+1 - 2
        //multiply 1 x j
        //traverse through the array - i -1
        //multi ply 1x i-1
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++){
               int prod = 1;
               for(int j = 0; j < n; j++){
                 if(i != j){
                    prod = prod * nums[j];
                 }

               }
            res[i] = prod;
        }
        return res;
        
    }
}  
