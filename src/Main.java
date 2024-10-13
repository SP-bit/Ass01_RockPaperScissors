import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        String aInput = "";
        String bInput = "";
        boolean done = false;
        boolean done2 = false;
        boolean playAgain;
        String response = "";
        do
        {
            do
            {
                System.out.print("Enter Player A's move (R, P, or S): ");
                if (in.hasNext())
                {
                    aInput = in.next();
                    if (aInput.equalsIgnoreCase("R") || aInput.equalsIgnoreCase("P") || aInput.equalsIgnoreCase("S"))
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println("You said Player A's move was: " + aInput);
                        System.out.println("Enter a valid move!");
                    }
                }
            }
            while (!done);
            do
            {
                System.out.print("Enter Player B's move (R, P, or S): ");
                in.nextLine();
                if (in.hasNext())
                {
                    bInput = in.next();
                    if (bInput.equalsIgnoreCase("R") || bInput.equalsIgnoreCase("P") || bInput.equalsIgnoreCase("S"))
                    {
                        done2 = true;
                    }
                    else
                    {
                        System.out.println("You said Player B's move was: " + bInput);
                        System.out.println("Enter a valid move!");
                    }
                }
            }
            while (!done2);
            if(aInput.equals(bInput))
            {
                System.out.println("It's a tie!");
            }
            else if ((aInput.equalsIgnoreCase("R") && bInput.equalsIgnoreCase("S")) ||
                    (aInput.equalsIgnoreCase("S") && bInput.equalsIgnoreCase("P")) ||
                    (aInput.equalsIgnoreCase("P") && bInput.equalsIgnoreCase("R")))
            {
                System.out.println("Player A wins!");
            }
            else
            {
                System.out.println("Player B wins!");
            }
            System.out.print("Play again (Y/N): ");
            response = in.next();
            playAgain = response.equalsIgnoreCase("Y");
        }
        while(playAgain);
        System.out.println("Thanks for playing. Hope you had fun!");
    }
}
