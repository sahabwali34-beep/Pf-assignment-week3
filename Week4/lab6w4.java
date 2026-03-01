import java.util.Scanner;

public class Table{

    public static void tableMultiplication(int a,int b){

        for(int i=1;i<=b;i++){
 
           int c=a*i;

            System.out.println(a+"x"+i+"="+c);

        }
 
   }
  
  public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of Table:");
 
       int num=sc.nextInt();
 
       int lastnum=sc.nextInt();
 
       tableMultiplication(num,lastnum);

    }

}