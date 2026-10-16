class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int r = mat.length;
        int c = mat[0].length;

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(target == mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
