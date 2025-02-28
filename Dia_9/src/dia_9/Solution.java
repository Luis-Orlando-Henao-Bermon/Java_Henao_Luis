
package dia_9;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public void gameOfLife(int[][] board) {
        
                
        int[][] newBoard =new int[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            
            for (int j = 0; j < board[i].length; j++) {
                int contador=0;
                if (i > 0) contador+=board[i-1][j]; //Arriba
                if (i < board.length - 1) contador+=board[i+1][j]; //abajo
                if (j > 0)contador+=board[i][j-1]; //Izquierda
                if (j < board[i].length - 1) contador+=board[i][j+1]; //derecha
                if (i > 0 && j > 0) contador+= board[i-1][j-1];//Diagonal superior izquierda
                if (i > 0 && j < board[i].length - 1) contador+=board[i-1][j+1];//Diagonal superior derecha
                if (i < board.length - 1 && j > 0) contador+=board[i+1][j-1];//Diagonal inferior izquierda
                if (i < board.length - 1 && j < board[i].length - 1)contador+=board[i+1][j+1];//Diagonal inferior derecha
                
                
                if (board[i][j]==1 && contador<2) {
                    newBoard[i][j]=0;
                }
                else if(board[i][j]==1 && contador>3){
                    newBoard[i][j]=0;
                }
                else if (board[i][j]==1 && (contador>=2&&contador<=3)) {
                    newBoard[i][j]=1;
                }
                else if (board[i][j]==0 && contador==3) {
                    newBoard[i][j]=1;
                }
            }
            
        }
        
        
         for (int i = 0; i < board.length; i++) {
            
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]=newBoard[i][j];
            }
        }
                
        
        
        /*
        //solucion numero1
        int horizontal = matrix[0].length;
        int vertical = matrix.length;

        int left = 0;
        int right = horizontal - 1;
        int top = 0;
        int bottom = vertical - 1;
        
        List<Integer> finalA = new ArrayList<>();
        

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                finalA.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                finalA.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    finalA.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    finalA.add(matrix[i][left]);
                }
                left++;
            }
        }

        return finalA;*/
        
         
        /*int horizontal = n;
        int vertical = n;

        int left = 0;
        int right = horizontal - 1;
        int top = 0;
        int bottom = vertical - 1;
               
        int contador=1;
                
        int[][] xd=new int[n][n];
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                xd[top][i]=contador;
                contador ++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                xd[i][right]=contador;
                contador++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    xd[bottom][i]=contador;
                    contador++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    xd[i][left]=contador;
                    contador++;
                }
                left++;
            }
        }

        
        
        return xd;*/
        
        
    }
    
    
}
