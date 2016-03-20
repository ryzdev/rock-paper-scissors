package game;

public class Opponent {

    //private int numWins = 0;

    String[] words = {"rock", "paper", "scissors"};

    // public void getNumWins(){}
    // public void numWins++

    public String getGuess() {
        int numWords = words.length;
        int randomNumber = (int)(Math.random() * numWords);
        String randomWord = words[randomNumber];
        return randomWord;
    }
}
