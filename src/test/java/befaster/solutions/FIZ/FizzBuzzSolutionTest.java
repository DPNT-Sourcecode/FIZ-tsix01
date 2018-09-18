package befaster.solutions.FIZ;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {
//        - If the number is a multiple of five then you should write "buzz"
//        - If the number is a multiple of both three and five then you should write "fizz buzz"
//        - If the number is not a multiple of five or three then write the number, example 1

    @Test
    public void shouldReturnFizzIfMultipleOfThree() {

        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(21);

        assertThat(result, is("fizz"));
    }

    @Test
    public void shouldReturnPassedNumberIfNotMultipleOfThree() {
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
}