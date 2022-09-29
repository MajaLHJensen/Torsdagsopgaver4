import java.util.Random;
import java.util.Scanner;

public class GuessNumber
{
    private static int rnd_number;

    public static class GuessANumber {

        public static void main(String[] args) {
            // pick a random number
            Random random = new Random();
            rnd_number = random.nextInt(100) + 1;
            System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
            System.out.println( "Can you guess what it is?...");
            makeAGuess();
        }
        private static void makeAGuess(){


            Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.println("Input:");
                int Input = scanner.nextInt();
                if(Input == rnd_number)
                {
                    System.out.println("Right answer");
                }
                else if(Input > rnd_number){
                    System.out.println("Lower");
                }
                else {
                    System.out.println("Higher");
                }

            }
        }


    }
}
