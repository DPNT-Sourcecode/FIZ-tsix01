package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if (isDeluxe(number)) {
            return "deluxe";
        }

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
        return ((number > 10 ) && isSameDigit(number));
    }

    private boolean isSameDigit(Integer number) {
        String stringRepresentation = String.valueOf(number);
        char[] chars = stringRepresentation.toCharArray();

        for (char c : chars) {
            if (chars[0] == c) {
                continue;
            }
            return false;
        }

        return true;
    }

}
