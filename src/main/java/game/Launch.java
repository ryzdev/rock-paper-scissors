package game;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        Opponent myOpponent = new Opponent();
        RuleEngine ruler = new RuleEngine();
        //Game newGame = new Game();

        //Game.go();

        int numMyWins = 0;
        int opponentNumWins = 0;
        boolean winner = false;

        System.out.println("Rock, paper, scissors? Best of 3.");

        while (winner == false){
            String textInput = userInput.next();

            String winDrawLose = ruler.getResult(textInput, myOpponent.getGuess());

            if (winDrawLose.equals("win")){
                System.out.println("You win.");
                numMyWins++;
            }

            if (winDrawLose.equals("lose")) {
                System.out.println("Opponent wins.");
                opponentNumWins++;
            }

            if(winDrawLose.equals("draw")) {
                System.out.println("Draw.");
            }

            if (numMyWins < 3 && opponentNumWins < 3){
                System.out.println("Rock, paper, scissors?");
            }   else if (numMyWins == 3){
                System.out.println("You win the game!!");
                winner = true;
            }   else {
                System.out.println("Opponent wins the game!!");
                winner = true;
            }

        }



        /*  Simplified version, first to 3 wins, wins!

            Bugs:
            if you input nonsense, opponent still guesses
            if you input nonsense will sometimes still answer

            Features to add:
            not understood input
            user input in Player class, so can just call the method
            best of 3 calculation. Where? number of wins kept in eah player object
            ignore capitalisation
            accept r, p, s
            more players?
         */




    }
}
