
package dia_9;

public class Dia_9 {

    public static void main(String[] args) {
        
        Solution miSolution=new Solution();
        
        int [][] xd= new int[4][3];
        xd[0][0]=0;
        xd[0][1]=1;
        xd[0][2]=0;
        xd[1][0]=0;
        xd[1][1]=0;
        xd[1][2]=1;
        xd[2][0]=1;
        xd[2][1]=1;
        xd[2][2]=1;
        xd[3][0]=0;
        xd[3][1]=0;
        xd[3][2]=0;
        
        miSolution.gameOfLife(xd);
    }
    
}
