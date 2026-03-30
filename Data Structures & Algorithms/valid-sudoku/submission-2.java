class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<String, HashSet<Character>> square = new HashMap<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j< board.length; j++){
                if(board[i][j] == '.') continue;
                String squareKey = (i/3) + "," + (j/3);

                if(row.computeIfAbsent(i, key -> new HashSet<>()).contains(board[i][j])){
                    return false;
                }
                if(col.computeIfAbsent(j, key -> new HashSet<>()).contains(board[i][j])){
                    return false;
                }
                if(square.computeIfAbsent(squareKey, key -> new HashSet<>()).contains(board[i][j])){
                    return false;
                }

                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                square.get(squareKey).add(board[i][j]);
            }
        }
        return true;
    }
}
