package befaster.solutions.FIZ;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {

    @Test
    public void shouldReturnFizzIfMultipleOfThree() {

        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(21);

        assertThat(result, is("fizz"));
    }

    @Test
    public void shouldReturnPassedNumberIfNotMultipleOfThreeOrFive() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(22);

        assertThat(result, is("22"));
    }

    @Test
    public void shouldReturnBuzzIfMultipleOfFive() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(25);

        assertThat(result, is("buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzIfMultipleOfFiveAndThree() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(60);

        assertThat(result, is("fizz buzz"));
    }

    @Test
    public void shouldReturnFizzWhenNumberHasThree() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(163);

        assertThat(result, is("fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenNumberHasFive() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(151);

        assertThat(result, is("buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberHasFizzAndBuzz() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(153);

        assertThat(result, is("fizz buzz"));
    }

}