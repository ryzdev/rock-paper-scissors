package game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HumanPlayerTest {

    public static final String TEST_INPUT = "test input";
    HumanPlayer testPlayer;



    @Before
    public void createPlayerBeforeEachTest(){
        testPlayer = new HumanPlayer();
    }

    @Test
    public void GetGuessShouldReturnString(){
        String answer = testPlayer.getGuess();
        assertThat(answer, is(instanceOf(String.class)));
    }

    @Test
    public void getGuessShouldReturnUserInput(){
        String answer = testPlayer.getGuess();
        assertThat(answer, is(TEST_INPUT));

    }

}


/*

@RunWith(MockitoJUnitRunner.class)

@Mock
    Scanner mockUserInputScanner;

//in method

 when(mockUserInputScanner.next()).thenReturn(TEST_INPUT);

 */
