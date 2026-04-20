class Solution {
    public int majorityElement(int[] nums) {
        // in my mind
        // map - key = the element , value = number of time the element has repeated
        // get the key where value > n/2
        // return the key

        int res = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, (map.getOrDefault(num, 0) + 1));
            if (map.get(num) > maxCount) {
                res = num;
                maxCount = map.get(num);
            }
        }
        return res;
    }
}