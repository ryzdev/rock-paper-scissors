package game;

public class RuleEngine {


    public String getResult(String myInputGuess, String opponentGuess) {



        //paper, scissors are true                           rock, scissors true                       paper, rock true
       // if (!myInputGuess.equals(Guess.rock) || !myInputGuess.equals(Guess.paper) || !myInputGuess.equals(Guess.scissors)){
        //    return "invalidGuess";
       // }


        System.out.println(opponentGuess);
        if(myInputGuess.equals(opponentGuess)){
            return "draw";
        }

        if (myInputGuess.equals("rock")) {
            if (opponentGuess.equals("scissors")) {
                return "win";
            }
            if (opponentGuess.equals("paper")) {
                return "lose";
            }
            return "error";
        }

        if (myInputGuess.equals("paper")) {
            if (opponentGuess.equals("rock")) {
                return "win";
            }
            if (opponentGuess.equals("scissors")) {
                return "lose";
            }
            return "error";
        }

        if (myInputGuess.equals("scissors")) {
            if (opponentGuess.equals("paper")) {
                return "win";
            }
            if (opponentGuess.equals("rock")) {
                return "loose";
            }
        }

        return "error";

    }
}
