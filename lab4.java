
 //lab4:write a program that finds average score for student result array.

class Main {

    public static void main(String[] args) {

        int[] marks={65,55,89,95,76,98};

        int score=0;

        for(int i=0;i<marks.length;i++){

            score+=marks[i];

        }

        double Average=score/marks.length;

            System.out.println("The average score of student is:"+Average);

    }

}