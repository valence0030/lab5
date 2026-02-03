import java.util.Scanner;
public class gradeChecker {
    public static char getgrade(int score){
        if(score >= 70 && score <=100 ){
            return 'A';
        }else if(score >= 60 ){
            return 'B';
        }else if(score >= 50 ){
            return 'C';
        }else if(score >= 40 ){
            return 'D';

        }else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        int score = input.nextInt();
        char grade = getgrade(score);
        System.out.println("Your grade is " + grade);

    }
}

