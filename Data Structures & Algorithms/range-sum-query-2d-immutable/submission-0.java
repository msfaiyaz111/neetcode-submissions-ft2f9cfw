class NumMatrix {
    int[][] matrix = null;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i>=row1 && j>=col1 && i<=row2 && j<=col2){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */