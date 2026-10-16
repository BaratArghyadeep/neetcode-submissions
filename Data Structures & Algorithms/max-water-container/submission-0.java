class Solution {
    public int maxArea(int[] heights) {
        
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int maxWater = 0;
        while(left < right)
        {
            int height = Math.min(heights[left] , heights[right]);
            int width = Math.abs(right - left);
            int area = height * width;
            maxWater = Math.max(maxWater , area);

            if(heights[left] < heights[right])
            {
                left ++;
            }
            else
            {
                right--;
            }

        }

        return maxWater;
    }
}
