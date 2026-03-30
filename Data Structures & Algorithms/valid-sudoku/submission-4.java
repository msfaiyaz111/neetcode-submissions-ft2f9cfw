class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[]  bucket = new int[9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '1'){
                    bucket[0]++;
                    if(bucket[0]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '2'){
                    bucket[1]++;
                    if(bucket[1]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '3'){
                    bucket[2]++;
                    if(bucket[2]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '4'){
                    bucket[3]++;
                    if(bucket[3]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '5'){
                    bucket[4]++;
                    if(bucket[4]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '6'){
                    bucket[5]++;
                    if(bucket[5]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '7'){
                    bucket[6]++;
                    if(bucket[6]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '8'){
                    bucket[7]++;
                    if(bucket[7]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '9'){
                    bucket[8]++;
                    if(bucket[8]>1){
                        return false;
                    }
                }
            }
            bucket = new int[9];
        }
        for(int j=0; j<9; j++){
            for(int i=0; i<9; i++){
                if(board[i][j] == '1'){
                    bucket[0]++;
                    if(bucket[0]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '2'){
                    bucket[1]++;
                    if(bucket[1]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '3'){
                    bucket[2]++;
                    if(bucket[2]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '4'){
                    bucket[3]++;
                    if(bucket[3]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '5'){
                    bucket[4]++;
                    if(bucket[4]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '6'){
                    bucket[5]++;
                    if(bucket[5]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '7'){
                    bucket[6]++;
                    if(bucket[6]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '8'){
                    bucket[7]++;
                    if(bucket[7]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '9'){
                    bucket[8]++;
                    if(bucket[8]>1){
                        return false;
                    }
                }
            }
            bucket = new int[9];
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j] == '1'){
                    bucket[0]++;
                    if(bucket[0]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '2'){
                    bucket[1]++;
                    if(bucket[1]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '3'){
                    bucket[2]++;
                    if(bucket[2]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '4'){
                    bucket[3]++;
                    if(bucket[3]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '5'){
                    bucket[4]++;
                    if(bucket[4]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '6'){
                    bucket[5]++;
                    if(bucket[5]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '7'){
                    bucket[6]++;
                    if(bucket[6]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '8'){
                    bucket[7]++;
                    if(bucket[7]>1){
                        return false;
                    }
                }
                else if(board[i][j] == '9'){
                    bucket[8]++;
                    if(bucket[8]>1){
                        return false;
                    }
                }
            }
            bucket = new int[9];
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    for(int l=0;l<3; l++){
                        if(board[3*i+k][3*j+l] == '1'){
                            bucket[0]++;
                            if(bucket[0]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '2'){
                            bucket[1]++;
                            if(bucket[1]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '3'){
                            bucket[2]++;
                            if(bucket[2]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '4'){
                            bucket[3]++;
                            if(bucket[3]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '5'){
                            bucket[4]++;
                            if(bucket[4]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '6'){
                            bucket[5]++;
                            if(bucket[5]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '7'){
                            bucket[6]++;
                            if(bucket[6]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '8'){
                            bucket[7]++;
                            if(bucket[7]>1){
                                return false;
                            }
                        }
                        else if(board[3*i+k][3*j+l] == '9'){
                            bucket[8]++;
                            if(bucket[8]>1){
                                return false;
                            }
                        }
                    }
                }
                bucket = new int[9];
            }
        }
        return true;
    }
}
