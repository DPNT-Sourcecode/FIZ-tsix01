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

        String result = fizzBuzzSolution.fizzBuzz(41);

        assertThat(result, is("41"));
    }

    @Test
    public void shouldReturnFizzBuzzIfMultipleOfFiveAndThree() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(60);

        assertThat(result, is("fizz buzz"));
    }

    @Test
    public void shouldReturnFizzDeluxWhenNumberHasThree() {
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
    public void shouldReturnFizzBuzzFakeDeluxeWhenNumberHasFizzBuzzAndFakeDeluxe() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(153);

        assertThat(result, is("fizz buzz fake deluxe"));
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsDevisibleByFive() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(20);

        assertThat(result, is("buzz"));
    }

    @Test
    public void shouldReturnFizzDeluxeWhenNumberIsFizzAndDeluxe() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(33);

        assertThat(result, is("fizz fake deluxe"));
    }

    @Test
    public void shouldReturnBuzzDeluxeWhenNumberIsBuzzAndDeluxe() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(55);

        assertThat(result, is("buzz fake deluxe"));
    }

    @Test
    public void shouldReturnFizzBuzzDeluxeWhenNumberIsFizzBuzzAndDeluxe() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(555);

        assertThat(result, is("fizz buzz fake deluxe"));
    }

    @Test
    public void shouldReturnNumberWhenNotDevisibleByThreeOrFive() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(11);

        assertThat(result, is("11"));
    }

    @Test
    public void shouldReturnFizzDeluxeWhenDevisibleByThreeAndNumberHasThree() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(312);

        assertThat(result, is("fizz deluxe"));
    }

    @Test
    public void shouldReturnBuzzDeluxeWhenDevisibleByFiveAndNumberHasFive() {
        FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

        String result = fizzBuzzSolution.fizzBuzz(520);

        assertThat(result, is("buzz deluxe"));
    }

}
