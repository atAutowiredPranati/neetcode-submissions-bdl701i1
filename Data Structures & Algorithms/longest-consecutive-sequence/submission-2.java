class Solution {
    public int longestConsecutive(int[] nums) {
        // create a set where all the numbers are present
        // iterate through nums
        // check if the number is present , if yes then check if its +1 is present , if yes then
        // ++count and the number if no, continue

        Set<Integer> set = new HashSet<>();
        int res = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            int streak = 0;
            int currentNumber = num;

            while (set.contains(currentNumber)) {
                streak++;
                currentNumber++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
