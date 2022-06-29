import java.util.Random;
import java.util.Scanner;
class Stone_paper_Scissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Welcome to Tic Tac Toe ");
        System.out.println("Enter \n R for Rock \n P for Paper \n S for Scissiors \n E to end the game ");
        while(true) {
            char cd = sc.next().charAt(0);
            String s = Character.toString(cd);
            s = s.toUpperCase();
            char c = s.charAt(0);
            int n = rn.nextInt(3);
            /* 0 = Rock
                1 = Paper
                2 = scissiors
             */
            if (c == 'R' && n == 0) {
                System.out.println(c + " VS " + "R");
                System.out.println("Tie - Try again");
            } else if (c == 'R' && n == 1) {
                System.out.println(c + " VS " + "P");
                System.out.println("You Lose - Better luck next time ");
            } else if (c == 'R' && n == 2) {
                System.out.println(c + " VS " + "S");
                System.out.println("You win - Congratulations ");
            }
            // For Paper
            if (c == 'P' && n == 0) {
                System.out.println(c + " VS " + "R");
                System.out.println("You win - Congratulations ");
            } else if (c == 'P' && n == 1) {
                System.out.println(c + " VS " + "P");
                System.out.println("Tie - Try again");

            } else if (c == 'P' && n == 2) {
                System.out.println(c + " VS " + "S");
                System.out.println("You Lose - Better luck next time ");
            }
            // for scissiors
            if (c == 'S' && n == 0) {
                System.out.println(c + " VS " + "R");
                System.out.println("You Lose - Better luck next time ");
            }
            else if (c == 'S' && n == 1) {
                System.out.println(c + " VS " + "P");
                System.out.println("You win - Congratulations ");
            }
            else if (c == 'S' && n == 2) {
                System.out.println(c + " VS " + "S");
                System.out.println("Tie - Try again");
            }
            else if (c == 'E')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input");
        }
        }
    }
}
