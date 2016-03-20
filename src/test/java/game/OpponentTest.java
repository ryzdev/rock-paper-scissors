package game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;


public class OpponentTest {

    Opponent Player2;

    @Before
    public void createOpponent(){
        Player2 = new Opponent();
    }
    @Test
    public void shouldReturnRockPaperScissors() {
        String guess = Player2.getGuess();

        assertTrue(guess == "rock" || guess == "paper" || guess == "scissors");
        //trying out different Hamcrest matchers
        assertThat(guess, is(anyOf(equalTo("rock"), equalTo("paper"), equalTo("scissors"))));
        assertThat(guess, is(instanceOf(String.class)));
        assertThat(guess, anything());
    }



}
