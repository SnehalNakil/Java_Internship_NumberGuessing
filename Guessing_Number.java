import java.util.*;
import java.util.random.*;
public class Guessing_Number {

    public static void guesNo() {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int ran_no = random.nextInt(100);
        ran_no +=1;
        int guess,play_again;

            int attempts = 0, points = 0;
            System.out.println("\nWELCOME TO GUESSING NUMBER GAME!");
            System.out.println("\nLet us Start Guessing !!");
            
            while(attempts<3) {
                System.out.println("\nGuess the Number from 1 to 100 :");
                guess = sc.nextInt();
                
            if(guess>ran_no) {
                System.out.println("\nSorry! Number is less than "+guess);
            }

            else if(guess<ran_no) {
                System.out.println("\nSorry! Number is greater than "+guess);
            }

            else{
                points += 100-(25*(attempts));
                System.out.println("\nExcellent Guess!! You are Correct ");
                System.out.println("\n The number is :"+guess);
                System.out.println("\nYou scored: "+points);
                System.out.println("\n Do you wnat to play the game again? If YES press 1");

            play_again = sc.nextInt();

            if(play_again == 1){
        guesNo();
            }

            else{
                System.out.println("\nThank you !! Play Again... ");
            break;
            }
            }

attempts +=1;
            }

        if(attempts == 3) {
            points = 0;
            System.out.println("\nYou are out of chances ! Sorry!");
            System.out.println("\nYour score: "+points);
            System.out.println("\n The number you have missed is :"+ran_no);
            System.out.println("\n DO you want to play again? If YES Press 1 or else Press 2");
            play_again = sc.nextInt();

            if(play_again ==1) {
                guesNo();
            }
            else{
                System.out.println("Thank You!! Play Again.... ");
            }
        }
        sc.close();
    }
    public static void main(String args[]) {
        guesNo();
    }
}





