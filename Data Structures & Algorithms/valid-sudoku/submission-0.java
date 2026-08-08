class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean rowNoDup = true; 
        boolean colNoDup = true; 
        boolean boxNoDup = true; 
        List<Set<Character>> valsBox = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            valsBox.add(new HashSet<Character>());
        }
        for(int i = 0; i < board.length; i++){

            Set<Character> valsRow = new HashSet<>();
            Set<Character> valsCol = new HashSet<>();
            
            for(int j = 0; j < board[i].length; j++){

                if( (board[i][j] != '.') && (!valsRow.add(board[i][j])) ){
                   rowNoDup = false;
                   break;
                }
                if( (board[j][i] != '.') && (!valsCol.add(board[j][i])) ){
                   colNoDup = false;
                   break;
                }

                if((board[i][j] != '.') && (!valsBox.get((i/3) * 3 + (j/3)).add(board[i][j]))){
                   boxNoDup = false;
                   break;
                }
            }
            if(!rowNoDup || !colNoDup || !boxNoDup){
                return false;
            }

        }
        return true;

    }
}
