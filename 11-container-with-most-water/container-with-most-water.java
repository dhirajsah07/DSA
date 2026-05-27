class Solution {
    public int maxArea(int[] height) {
        // width --- left - right
        // length --  min value
        // current value -- length * width
        int left =0;
        int right = height.length-1;
        int max_global_area=0;
        while(left < right)
        {
            int len = Math.min(height[left], height[right]);
            int width = right - left;
            int currarea = len * width;
            max_global_area = Math.max(max_global_area, currarea);
            if(height[left] <= height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max_global_area;
    }
}