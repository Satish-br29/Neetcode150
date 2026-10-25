class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int result[] = new int[temp.length];

        for (int i = 0; i < temp.length - 1; i++) {
            int j = i + 1;

            while (j < temp.length && temp[i] >= temp[j]) {
                j++;
            }

            if (j < temp.length) {
                result[i] = j - i;
            }
        }
        return result;
    }
}
