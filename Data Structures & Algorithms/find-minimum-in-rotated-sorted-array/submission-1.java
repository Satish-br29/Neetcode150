class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[right] < nums[mid]) {
                if (left == mid) {
                    return nums[right];
                } else {
                    left = mid;
                }
            } else {
                right = mid;
            }
        }
        return nums[right];
    }
}
