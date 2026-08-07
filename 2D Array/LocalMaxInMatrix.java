import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] d = new int[n-2][n-2];
        for(int i=0;i<=n-3;i++) {
            for(int j=0;j<=n-3;j++) {
                int max = Integer.MIN_VALUE;
                for(int r=i;r<i+3;r++) {
                    for(int c=j;c<j+3;c++) {
                        max = Math.max(max,matrix[r][c]);
                    }
                }
                d[i][j] = max;
            }
        }
        for(int i=0;i<n-2;i++) {
            for(int j=0;j<n-2;j++) {
                if(j>0){
                    System.out.print(" ");
                }
                System.out.print(d[i][j]);
            } 
            System.out.println();
        }
    }
}
