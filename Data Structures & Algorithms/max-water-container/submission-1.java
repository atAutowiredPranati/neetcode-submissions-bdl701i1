class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length - 1;
        int lp = 0;
        int rp = n;
        int area = 0;

        while (lp < rp) {
            int height = Math.min(heights[lp], heights[rp]);
            int width = rp - lp;
            area = Math.max((height * width), area);

            if (heights[lp] < heights[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return area;
    }
}
