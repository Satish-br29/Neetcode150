class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }

        int longSeq = Integer.MIN_VALUE;

        for (int curr : set) {
            if (!set.contains(curr - 1)) {
                int start = curr;
                int count = 1;
                while (set.contains(++start)) {
                    count++;
                }
                longSeq = Math.max(longSeq, count);
            }
        }
        return (longSeq == Integer.MIN_VALUE ? 0 : longSeq);
    }
}
