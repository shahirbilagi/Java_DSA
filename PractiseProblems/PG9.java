package PractiseProblems;

public class PG9 {
    public static void main(String args[]) {
        int[][] a1 = { { 44, 35},
                { 51, 63 } };
        int[][] a2 = { { 44, 35},
                { 51, 63} };
        int c[][] = new int[2][2];
        
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j]=a1[2][2]+a2[2][2];
                System.out.print(c[i][j]+"\t");
            }
        }
        
    }
}
