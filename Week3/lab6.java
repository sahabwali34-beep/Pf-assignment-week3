
 //l:write a program to count how many numbers in the array are even or how many are odd.Print both count.

class Main {
 
   public static void main(String[] args) {
 
       int[] num={65,57,89,92,48,79,76,98};

        int a=0;

        int b=0;
 
       for(int i=0;i<num.length;i++){
 
           if(num[i]%2==0){

            a++;

           }
 
           else{
 
               b++;
 
           }
 
       }
 
           System.out.println("Even Count:"+a);

            System.out.println("Odd Count:"+b);
 
  }

}

