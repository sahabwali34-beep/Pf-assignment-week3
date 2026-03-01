
public class Matrixaddition {

    public static void main(String[] args) {
 
       int[][] a={{1,2,3},{4,5,6},{7,8,9}};

        int[][] b={{2,4,6},{3,6,9},{4,8,12}};

        int [][]sum=addMatrices(a,b);

        if(sum!=null){

            System.out.println("Matrix A:");

            printMatrix(a);

            System.out.println("MATRIX B;");

            printMatrix(b);

            System.out.println("The sum matrix is:");
 
           printMatrix(sum);
 
           
        }
 
   }

    public static int[][]addMatrices(int[][]matrix1,int[][]matrix2){
 
       if(matrix1.length()!=matrix2.length()){
 
           System.out.println("ERROR:Matrices must have equal number of rows");
 

           return null;

        }
 
       int rows=matrix1.length();

        int col=matrix1[0].length();

            if(col!=matrix2[0].length()){
 
               System.out.println("Matrices must have equal col");
  
              return null;

            }
 
       int[][] result=new int [rows][col];
 
       for(int i=0;i<rows;i++){
 
           for(int j=0;j<col;j++){
  
              result[i][j]=firstmat[i][j]+secondmat[i][j];
 
       return result;
 
       }

        public static void printMatrix(int[][] matrix){
 
       if(matrix==null)

        return;
 
       for(int i=0;i<matrix.length;i++){
  
          for(int j=o;j<matrix[0].length();j++){
  
              System.out.print(matrix[i][j]+" ");


            }
   
        System.out.println(); 

        }
  
  }

}