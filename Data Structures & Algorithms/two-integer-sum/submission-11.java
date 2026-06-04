class Solution {
    public int[] twoSum(int[] nums, int target) {
        // using a (int , int) -> key = difference
        //                        value = index
        //(1,3) (2,4)
        // loop thorugh the map - if i have difference present.
        // take the iterating index and they key of the pair caught in difference.

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[] { map.get(difference), i};
            }
             map.put(nums[i], i);
        }

        return new int[] {};
    }
}
