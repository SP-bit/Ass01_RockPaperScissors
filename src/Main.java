import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        String myMove = "";
        String[] options = {"rock", "paper", "scissors"}; // list with trivial use
        String compMove;
        while (playAgain)
        {
            boolean correctInput = false;
            System.out.println("Choose rock, paper, or scissors: ");
            while(!correctInput)
            {
                myMove = in.nextLine(); // input + validated to make sure its right
                boolean valid = false;
                for(String option : options)
                {
                    if(myMove.equalsIgnoreCase(option))
                    {
                        valid = true;
                        break;
                    }
                }
                if(valid)
                {
                    correctInput = true;
                }
                else
                {
                    System.out.println("Not a valid input, please try again");
                }
            }
            compMove = options[rand.nextInt(3)];
            System.out.println("The computer chose: " + compMove);
            String result = getResult(myMove, compMove);
            System.out.println("Game over! Looks like you " + result);
            System.out.println("Do you want to play again (Y/N): ");
            String playAgainInput = in.nextLine();
            if(playAgainInput.equalsIgnoreCase("N"))
            {
                playAgain = false;
            }
        }
        in.close();
    }
    public static String getResult(String player, String computer) // procedure
    {
        if (player.equals(computer))
        {
            return("tied!");
        }
        else if (player.equals("rock") && computer.equals("scissors") || player.equals("scissors") && computer.equals("paper") || player.equals("paper") && computer.equals("rock"))
        {
            return("won!");
        }
        else
        {
            return "lost!";
        }
    }
}

