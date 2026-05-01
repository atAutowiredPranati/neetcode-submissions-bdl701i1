class Solution {
    public boolean hasDuplicate(int[] nums) {
        // in my mind
        // first approach ->
        // i traverse through teh array and store the array in a set if its not already available
        // if its available the return true

        HashSet<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            if (mySet.contains(num)) {
                return true;
            }
            mySet.add(num);
        }
        return false;
    }
}