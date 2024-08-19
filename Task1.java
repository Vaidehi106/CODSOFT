import java.util.Random;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Random rc = new Random();
        int score=0;
        String playagain;

        do
        {
            int number= rc.nextInt(100)+1;
            int attempts=7;
            boolean correctguess=false;

            System.out.println("i have guessed the number between 1 to 100 now its your turn.you got 7 attempts");

            for(int attempt=1;attempt <= attempts;attempt++)
            {
                System.out.println("attempt "+attempt+": guess a number:");
                int guess = sc.nextInt();

                if (guess>number)
                {
                    System.out.println("oops!Number is too high");
                }
                else if (guess<number)
                {
                    System.out.println("nope!Number is too small");
                }
                else
                {
                    System.out.println("yaayay!you guessed the right number");
                    correctguess=true;
                    score++;
                    break;
                }
            }
            if (!correctguess)
            {
                System.out.println("sorry you ran out of attempts :( the correct number was"+number+".");
            }
            System.out.println("hey man you wanna play again? ");
            playagain = sc.next();

        }
        while(playagain.equalsIgnoreCase("yes"));

        System.out.println("game over!your score is "+score+".");
        sc.close();
    }
}
