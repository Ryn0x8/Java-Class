import java.util.*;

public class NQueens {
    private final int n;
    private final List<List<String>> solutions = new ArrayList<>();

    public NQueens(int n){
        this.n = n;
    }

    private boolean isSafe(char[][] board ,int row, int col){
        for (int i=0; i<row; i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        for (int i=row, j=col; i>=0 && j>=0; i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        for (int i=row, j=col; i>=0 && j<n; i--, j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    private void solveNQueens(char[][] board, int row){
        if (row == n){
            addSolution(board);
            return;
        }
        for (int col = 0; col< n; col++){
            if (isSafe(board, row, col)){
                board[row][col] = 'Q';
                solveNQueens(board, row+1);
                board[row][col] = '.';
            }
        }
    }

    private void addSolution(char[][] board){
        List<String> solution = new ArrayList<>();
        for (char[] row: board){
            solution.add(new String(row));
        }
        solutions.add(solution);
    }

    private List<List<String>> solve(){
        char[][] board = new char[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        solveNQueens(board, 0);
        return solutions;
    }

    public void printSolution(){
        if (solutions.isEmpty()){
            System.out.println("No solution found");
        }
        else{
            int count = 1;
            for (List<String> solution: solutions){
                System.out.println("Solution"+ count+":");
                for (String row: solution){
                    System.out.println(row);
                }
                System.out.println();
                count++;
            }
        }
    }

    public static void main(String[] args){
        int n = 4;
        NQueens queenSolver = new NQueens(n);
        queenSolver.solve();
        queenSolver.printSolution();
    }    


}
