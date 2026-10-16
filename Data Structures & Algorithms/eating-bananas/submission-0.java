class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int val : piles) {  //highest range in piles 
            high = Math.max(high, val);
        }

        //Apply binary search on speed range from (low to high) not on piles[] 
        while (low <= high) {
            int curr_speed = low + (high - low) / 2;  //mid of range
            int totalhr = 0;

            for (int val : piles) {
                totalhr += (val + curr_speed - 1) / curr_speed;
            }

            if (totalhr > h) { // speed is too slow
                low = curr_speed + 1;
            } else { // try smaller speed
                high = curr_speed - 1;
            }
        }
        return low;
    }
}
