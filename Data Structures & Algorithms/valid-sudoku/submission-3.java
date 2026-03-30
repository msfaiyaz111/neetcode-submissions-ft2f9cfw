class Solution {
    int[] count = null;
    int[] count1 = null;
    public boolean isValidSudoku(char[][] board) {
        count = new int[9];
        count1 = new int[9];
        for(int i=0; i<board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '1') {
                    count[1]++;
                }
                if (board[i][j] == '2') {
                    count[2]++;
                }
                if (board[i][j] == '3') {
                    count[3]++;
                }
                if (board[i][j] == '4') {
                    count[4]++;
                }
                if (board[i][j] == '5') {
                    count[5]++;
                }
                if (board[i][j] == '6') {
                    count[6]++;
                }
                if (board[i][j] == '7') {
                    count[7]++;
                }
                if (board[i][j] == '8') {
                    count[8]++;
                }
                if (board[i][j] == '9') {
                    count[0]++;
                }
                if (board[j][i] == '1') {
                    count1[1]++;
                }
                if (board[j][i] == '2') {
                    count1[2]++;
                }
                if (board[j][i] == '3') {
                    count1[3]++;
                }
                if (board[j][i] == '4') {
                    count1[4]++;
                }
                if (board[j][i] == '5') {
                    count1[5]++;
                }
                if (board[j][i] == '6') {
                    count1[6]++;
                }
                if (board[j][i] == '7') {
                    count1[7]++;
                }
                if (board[j][i] == '8') {
                    count1[8]++;
                }
                if (board[j][i] == '9') {
                    count1[0]++;
                }
            }
//            System.out.println("here");
//            System.out.println(Arrays.toString(count));
//            System.out.println(Arrays.toString(count1));
            if (!check()) {
                return false;
            }

        }
        int n =0, p=3, m=0;
        int j = 0;
        for(int i=0; i<3; i++){
            for(j=0; j<3; j++){
//                System.out.println(p*n+i + " " + (p*n+j));
                if(board[p*n+i][p*m+j] == '1'){
                    count[1]++;
                }
                if(board[p*n+i][p*m+j] == '2'){
                    count[2]++;
                }
                if(board[p*n+i][p*m+j] == '3'){
                    count[3]++;
                }
                if(board[p*n+i][p*m+j] == '4'){
                    count[4]++;
                }
                if(board[p*n+i][p*m+j] == '5'){
                    count[5]++;
                }
                if(board[p*n+i][p*m+j] == '6'){
                    count[6]++;
                }
                if(board[p*n+i][p*m+j] == '7'){
                    count[7]++;
                }
                if(board[p*n+i][p*m+j] == '8'){
                    count[8]++;
                }
                if(board[p*n+i][p*m+j] == '9'){
                    count[0]++;
                }

            }
//            System.out.println("i = " + i + " j = " + j);
            if(i==2 && j==3){
//                    System.out.println(p*n+i + " " + (p*n+j));
//                    System.out.println("here1");
//                    System.out.println(Arrays.toString(count));
                if(!check()){
                    return false;
                }
                i = -1;
                j = 0;
//                System.out.println("n = " + n);
                n++;
                if(n==3) {
                    m++;
                    if (m != 3) {
                        n = 0;
                    }else {
                        break;
                    }
                }
            }
        }
        return true;
    }
    public boolean check(){
        boolean b = true;
        for(int i=0; i<9 ; i++){
            if(count[i] > 1){
                b = false;
            }
            count[i] = 0;
            if(count1[i] > 1){
                b = false;
            }
            count1[i] = 0;
        }
        return b;
    }
}
