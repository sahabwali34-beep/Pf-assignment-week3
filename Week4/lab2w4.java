public class MatrixPrinter{

    public static void printMatrix(int[][] matrix){

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){

                System.out.print(matrix[i][j]+" ");

                
            }

        System.out.println();

        }

    }

    public static void main(String[] args){

        int [][] matrixA={

            {1,2,3},

            {4,5,6},

            {7,8,9}
};

        System.out.println("Printing the matrix:");
 
       printMatrix(matrixA);

    }

}