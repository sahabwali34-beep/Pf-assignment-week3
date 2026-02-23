
 //lab3;Write a program to add twop matrices A and B,and stores the resultant matrix
 
class Main {

    public static void main(String[] args) {

        int[][]matrixA={{2,4,6},{3,6,9},{3,5,7}};

        int[][] matrixB={{1,2,3},{4,5,6},{7,8,9}};
        int[][]matrixC=new int[3][3];

        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){
                matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
               System.out.print(matrixC[i][j]+" ");

            }
  
         System.out.println();

        }
 
  }

}