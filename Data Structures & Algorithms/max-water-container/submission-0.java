class Solution {
    public int maxArea(int[] heights) {

        //on my mind
        //brute force ->
        //left loop , right loop
        //area = h * w
        //h = min of l,r
        //w  r-l
        //final area = max of area
        int n = heights.length;
        int area = 0;
        for(int left = 0 ; left < n - 1; left++){
            for(int right = left + 1; right < n ; right++){
                int height = Math.min(heights[left] , heights[right]);
                int width = right - left;
                area = Math.max(height * width , area);
            }
        }

        return area;
        
    }
}
