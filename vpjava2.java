import java.util.Random;
import java.util.Scanner;

public class vpjava2{
    public static  void main (String[] args){

        System.out.println("select 0 for rock\n\tselect 1 for paper\n\tselect 2 for scissor");
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        System.out.println("its your turn!");
        int human = sc.nextInt(3);
        if (human == 0 ){
            System.out.println("you have select ROCK");

        }
        if (human == 1){
            System.out.println("you have select PAPER");
        }
        if (human == 2){
            System.out.println("you have select SCISSOR");
        }
        System.out.println("now its computer turn!");
        int computer = rc.nextInt(3);
        if (computer == 0){
            System.out.println("computer have select ROCK");
        }
        if (computer == 1){
            System.out.println("computer have select PAPER");
        }
        if (computer == 2){
            System.out.println("computer have select SCISSOR");
        }
        if (human == computer){
            System.out.println("match is draw");
        }
        else if (human == 0 && computer == 2 || human == 1 && computer == 0 || human == 2 && computer == 1){
            System.out.println("Congratulation, you have won");
        }
        else {
            System.out.println("you lose \nbetter luck next time");
        }







    }
}

