
public class MatrixCalculator {

    public static void matrixAdd(int[][]a,int[][]b){
 
       if(a.length!=b.length)

        System.out.println("No.of rows must be equal:");

        if(a.length[0]!=b.length[0])
 
       System.out.println("No.of cols must be equal:");

        int row=a.length;

        int cols=a.length[0];


        int[][]c=new int[row][cols];
  
      for(int i=0;i<a.length;i++){
     
       for(int j=0;j<a.length[0];j++){
 
               c[i][j]=a[i][j]+b[i][j];
    
            System.out.print(c[i][j]+" ");

            }
  
          System.out.println();
 
       }
 
   }

        public static void matrixSub(int[][]a,int[][]b){
 
       if(a.length!=b.length)
  
      System.out.println("No.of rows must be equal:");
 
       if(a.length[0]!=b.length[0])
  
      System.out.println("No.of cols must be equal:");
 
       int row=a.length;

        int cols=a.length[0];

        int[][]c=new int[row][cols];

 
       for(int i=0;i<a.length;i++){
 
           for(int j=0;j<a.length[0];j++){
  
              c[i][j]=a[i][j]-b[i][j];
   
             System.out.print(c[i][j]+" ");
  
          }
 
           System.out.println();

        }

}
     
   public static void matrixTranspose(int[][]a){
 
       int row=a.length;
 
       int cols=a.length[0];
  
      int[][]c=new int[row][cols];

        System.out.println("The Transpose is :");


        for(int j=0;j<a.length[0];j++){
  
          for(int i=0;i<a.length;i++){
  
            System.out.print(a[i][j]+" ");
 
           }
      
      System.out.println();
  
      }

}

public static boolean isSymetric(int[][]a){
   
 for(int i=o;i<a.length;i++){
    
    for(int j=0;j<i;j++){
   
         if(a[i][j]!=a[j][i]){
 
               return false;
 
           }
  
      }
  
  }
   
 return true;
}
public static int sumDiagonal(int[][]a){

    int rows=a.length;
 
   int cols=a.length[0];

    
if(rows!=cols){

    System.out.println("Matrix must be square to sum diagonal elements;");

    return -1;

}

int sum=0;
for(int i=0;i<rows;i++){

    sum+=a[i][i];
}
return sum;
}


 
   
    public static void main(String[] args) {
 
       int[][]matrixA={{1,2,3},{4,5,6},{7,8,9}};
  
      int[][]matrixB={{2,4,6},{3,6,9},{4,8,9}};
 
       
        System.out.println("Matrix A IS SYMETRIC;"+isSymetric(matrixA));
 
       matrixAdd(matrixA,matrixB);

        matrixSub(matrixA,matrixB);
  
      matrixTranspose(matrixA);

        System.out.println("The sum of diagnol is:"+sumDiagnol(matrixA));
  
  }

}