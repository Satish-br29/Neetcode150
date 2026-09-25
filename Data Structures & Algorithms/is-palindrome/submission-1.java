class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        StringBuilder forward = new StringBuilder();

        for (char curr : s.toCharArray()) {
            if ((curr >= 'a' && curr <= 'z') ||
    (curr >= '0' && curr <= '9')){
                forward.append(curr);
            }
        }

        StringBuilder backward = new StringBuilder(forward);
        backward.reverse();

        if (forward.toString().equals(backward.toString())) {
            return true;
        }

        return false;
    }
}