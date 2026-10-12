class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxfreq = 0; // Highest character frequency seen
        int maxlen = 0;  // Longest valid window
        Map<Character, Integer> map = new HashMap<>();

        for (int right = left; right < s.length(); right++) {
            char ch = s.charAt(right);

            // Add current character to the window
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Update highest frequency
            if (maxfreq < map.get(ch)) {
                maxfreq = map.get(ch);
            }

            // Calculate replacements needed
            int currwinlen = right - left + 1;
            int checkwinvalid = currwinlen - maxfreq;

            // Shrink window if replacements exceed k
            while (checkwinvalid > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;

                // Recalculate window length and replacements
                currwinlen = right - left + 1;
                checkwinvalid = currwinlen - maxfreq;
            }

            // Update longest valid window length
            maxlen = Math.max(maxlen, currwinlen);
        }

        return maxlen; // Return the maximum length
    }
}