class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
                char num = board[i][j];
                int kthbox = (i / 3) * 3 + (j / 3);

                if (num == '.') {
                    continue;
                }

                if (rows[i].contains(num) || cols[j].contains(num) || boxes[kthbox].contains(num)) {
                    return false;
                }

                rows[i].add(num);
                cols[j].add(num);
                boxes[kthbox].add(num);
            }
        }

        return true;
    }
}
