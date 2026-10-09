class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            int width = right - left; // index values
            int minHeight = Math.min(height[left], height[right]);
            // from Taller and Smaller length will contains that smaller size level water

            area = Math.max(area, width * minHeight); // update area

            // move left forward when left level is small
            // move right backward when right level is small
            // if both heights are equal, moving either pointer is valid.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}
