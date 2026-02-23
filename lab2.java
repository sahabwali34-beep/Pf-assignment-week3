//Write a program that perform transpose operation on a 3x3 matrix.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][]matrix= new int [3][3];

        System.out.println("enter numbers:");

        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){

                matrix[i][j]=sc.nextInt();

            }

            System.out.println();

        }

        System.out.println("The Transpose is:");

        for(int j=0;j<3;j++){

            for(int i=0;i<3;i++){

                System.out.print(matrix[i][j]+" ");

            }
 
           System.out.println();

        }
 
   }
}