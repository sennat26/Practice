// you can also use imports, for example:
// import java.math.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution2 {
    
    
    public int solution(int[][] A) {
        // write your code in Java SE 8
        if (A == null || A.length == 0) {
            return 0;
        }
        
        int row = A.length;
        int col = A[0].length;
        boolean[][] visitedArea = new boolean[row][col];
        int areaCount = 0;
        
        for (int i =0; i < row; i++) {
            for (int j = 0; j< col; j++) {
                if (!visitedArea[i][j]) {
                    visitedArea[i][j] = true;
                    findNeighbours(A[i][j], i, j, row, col, A, visitedArea);
                    
                    areaCount++;
                }
            }
        }
        
        return areaCount;
    }
    
    private void findNeighbours(int color, int rowIndex, int colIndex, 
        int row, int col, int[][] A, boolean[][] visitedArea) {
        
        if (rowIndex >= 0 && colIndex >= 0 && rowIndex < row && colIndex < col) {
            
            //north
            if (rowIndex - 1 >= 0) {
                if (!visitedArea[rowIndex - 1][colIndex] && A[rowIndex - 1][colIndex] == color) {
                    visitedArea[rowIndex - 1][colIndex] = true;
                    findNeighbours(color, rowIndex - 1, colIndex, row, col, A, visitedArea);
                }
            }
            
            //south
            if (rowIndex + 1 < row) {
                if (!visitedArea[rowIndex + 1][colIndex] && A[rowIndex + 1][colIndex] == color) {
                    visitedArea[rowIndex + 1][colIndex] = true;
                    findNeighbours(color, rowIndex + 1, colIndex, row, col, A, visitedArea);
                }
            }
            
            //east
            if (colIndex + 1 < col) {
                if (!visitedArea[rowIndex][colIndex + 1] && A[rowIndex][colIndex + 1] == color) {
                    visitedArea[rowIndex][colIndex + 1] = true;
                    findNeighbours(color, rowIndex, colIndex + 1, row, col, A, visitedArea);
                }
            }
            
            //west
            if (colIndex - 1 >= 0) {
                if (!visitedArea[rowIndex][colIndex - 1] && A[rowIndex][colIndex - 1] == color) {
                    visitedArea[rowIndex][colIndex - 1] = true;
                    findNeighbours(color, rowIndex, colIndex - 1, row, col, A, visitedArea);
                }
            }
            
        }
        
    }
}
