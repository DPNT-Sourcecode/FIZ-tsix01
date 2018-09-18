package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if (isFizzBuzz(number)) {
            return "fizz buzz";
        }

        if (isFizz(number)) {
            return "fizz";
        }

        if (isBuzz(number)) {
            return "buzz";
        }

        return String.valueOf(number);
    }

    private boolean isFizz(Integer number) {
        return (number % 3 == 0 || String.valueOf(number).contains("3"));
    }

    private boolean isBuzz(Integer number) {
        return (number % 5 == 0 || String.valueOf(number).contains("5"));
    }

    private boolean isFizzBuzz(Integer number) {
        return ((number % 15 == 0) || ( isFizz(number) && isBuzz(number)));
    }

    private boolean isDeluxe(Integer number) {
        return (number > 10 );
    }
}
