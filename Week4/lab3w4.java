
public class Calculator{


   public static int max(int a,int b){

        if(a>b){


            return a;

  
      }
 
       else

 
       return b ;

 
       
    }


        public static int max(int a,int b,int c){

 
           int m=a;


            if(b>m){

  
          b=m;}

 
           if(c>m){
 

           c=m;
}
  
   return m;


            
 }

    public static double max(double a,double b){

 
       if(a>b)


        return a;

 
       else
 
 
      return b;


    }


    public static void main(String[] args){
 
   
    System.out.println("Max of 15,19:"+"  "+max(15,19));


        System.out.println("Max of 70,19,65:"+" "+max(70,19,65));


        System.out.println("Max of 6.5,7.8:"+"  "+max(6.5,7.8));

  
    }


} 