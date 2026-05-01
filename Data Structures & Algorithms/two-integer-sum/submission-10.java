class Solution {
    public int[] twoSum(int[] nums, int target) {
        // on my mind
        // create a hashmap
        // traverse through nums
        // take theindex and the target and do target - indexValue = value which i wanna look for in
        // the next iterations key = difference ; value = index if i find the value while iteration
        // -> capture that iterations'i return

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[] {map.get(difference), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
