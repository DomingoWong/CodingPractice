class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;
        boolean rowValid = checkRow(board);
        if (!rowValid) {
            return false;
        }
        boolean columnValid = checkColumn(board);
        if (!columnValid) {
            return false;
        }
        boolean boxValid = checkBox(board);
        if (!boxValid) {
            return false;
        }
        return true;
    }
    
    public boolean checkRow(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<Character>(9);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    
                } else {
                    if (set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
    
    public boolean checkColumn(char[][] board) {
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<Character>(9);
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') {
                    
                } else {
                    if (set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
    
    public boolean checkBox(char[][] board) {
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                //1,1 -> 3, 3 -> 3, 4 -> 3, 5 -> 4, 3
                Set<Character> set = new HashSet<Character>(9);
                for (int p = 0; p < 3; p++) {
                    for (int q = 0; q < 3; q++) {
                        if (board[i+p][j+q] == '.') {
                        } else {
                            if (set.contains(board[i+p][j+q])) {
                            return false;
                            } else {
                                set.add(board[i+p][j+q]);
                            }
                        }       
                    }
                }
            }
        }
        return true;
    }
}