import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                char number = board[row][column];
                if (number != '.') {
                    if (!set.add(number + " in row " + row) ||
                            !set.add(number + " in column " + column) ||
                            !set.add(number + " in block " + (row / 3) + "," + (column / 3)))
                        return false;
                }
            }
        }
        return true;
    }
}
