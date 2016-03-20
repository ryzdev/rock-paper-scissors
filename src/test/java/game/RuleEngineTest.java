package game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class RuleEngineTest {

    RuleEngine testRule;

    //@Mock
    //Opponent OpponentMock;

    @Before
    public void createRuleEngine() {
        testRule = new RuleEngine();
    }

    @Test
    public void getResultTest() {
        assertThat(testRule.getResult("rock", "paper"), is("lose"));
    }

    @Test
    public void nonsenseShouldReturnError() {
        assertThat(testRule.getResult("asdgfasdf", "paper"), is("error"));
    }

    /* not quite sure how to set up mocking
    @Test
    public void verifyGetResultMethodWithMock(){
        String answer = testRule.getResult(OpponentMock.getGuess(), "paper");
        //not sure where to go from here
    }
    */
}


//CORRECT SYNTAX FOR USING @BEFORE TO CREATE OBJECTS FOR TESTING