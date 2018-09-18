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

// - {"method":"fizz_buzz","params":[13],"id":"FIZ_R2_012"}, expected: "fizz", got: "13"
//        - {"method":"fizz_buzz","params":[43],"id":"FIZ_R2_013"}, expected: "fizz", got: "43"
//        - {"method":"fizz_buzz","params":[163],"id":"FIZ_R2_014"}, expected: "fizz", got: "163"

    @Test
    public void shouldReturnFizzWhenNumberHasThree() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(13);

        assertThat(result, is("fizz buzz"));
    }
}