
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
 
       Scanner sc= new Scanner(System.in);

        int[]num={55,89,45,23,34,57};

        int x=sc.nextInt();

        for(int i=0;i<num.length;i++){
 
           if(num[i]==x){

        System.out.println("x found at index:"+i);


            }

        }
 
   }

}