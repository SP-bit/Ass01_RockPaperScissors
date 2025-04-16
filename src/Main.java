import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean PlayAgain = true;
        String playerInput = "";
        String[] options = {"rock", "paper", "scissors"};
        String computerInput;
        while (PlayAgain)
        {
            boolean CorrectInput = false;
            System.out.println("Choose rock, paper, or scissors: ");
            while(!CorrectInput)
            {
                playerInput = in.nextLine();
                if(playerInput.equals(options[0])||playerInput.equals(options[1])||playerInput.equalsIgnoreCase(options[2]))
                {
                    CorrectInput = true;
                }
                else
                {
                    System.out.println("Not a valid input, please try again");
                }
            }
            computerInput = options[rand.nextInt(3)];
            System.out.println("The computer chose: " + computerInput);
            String result = getResult(playerInput, computerInput);
            System.out.println("You " + result);
            System.out.println("Do you want to play again (Y/N): ");
            String PlayAgainInput = in.nextLine();
            if(PlayAgainInput.equalsIgnoreCase("N"))
            {
                PlayAgain = false;
            }
        }
        in.close();
    }
    public static String getResult(String player, String computer)
    {
        if (player.equals(computer))
        {
            return("tied.");
        }
        else if (player.equals("rock") && computer.equals("scissors") || player.equals("scissors") && computer.equals("paper") || player.equals("paper") && computer.equals("rock"))
        {
            return("won.");
        }
        else
        {
            return "lost.";
        }
    }
}

