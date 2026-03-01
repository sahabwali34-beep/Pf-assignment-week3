
 //lab5:write a program to find and print the largest number in the array.

class Main {

    public static void main(String[] args) {

        int[] num={65,55,89,95,76,98};

        int max=num[0];

        for(int i=0;i<num.length;i++){

            if(num[i]>max){
 
              max=num[i];

            }

        }

            System.out.println("The  largest element is:"+max);

    }

}