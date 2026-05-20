class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer , Integer> map =new HashMap<>();
        int difference = 0;
        for(int i = 0 ; i < numbers.length ; i++){

            difference = target - numbers[i];
            if(map.containsKey(difference)){
                return new int[] {map.get(difference) , i + 1 };
            }
            map.put(numbers[i] , i + 1);
            
            
        }
        return new int[0];

        
        
    }
}
