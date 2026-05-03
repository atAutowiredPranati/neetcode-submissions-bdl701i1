class Solution {
    public int majorityElement(int[] nums) {

        //on my mind
        //create a map
        //store the key as the value if index
        //value as the number of times that index is repeated
        //if any value is greater than n/2 then return tahta value

        int n = nums.length;
        int maxCount = 0;
        int res = 0;
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+ 1);
            if(map.get(num) > maxCount){
                res = num;
                maxCount = map.get(num);     
            }
        }
        return res;
        
    }
}