package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        StringBuilder result = new StringBuilder();

        if (isFizz(number)) {
            result.append("fizz").append(" ");
        }

        if (isBuzz(number)) {
            result.append("buzz").append(" ");
        }

        if (isDeluxe(number)) {
            if(number % 2 != 0) {
                result.append("fake ");
            }
            result.append("deluxe");
        }

        if(result.length() == 0) {
            return String.valueOf(number);
        }
        return result.toString().trim();
    }

    private boolean isFizz(Integer number) {
        return (number % 3 == 0 || String.valueOf(number).contains("3"));
    }

    private boolean isBuzz(Integer number) {
        return (number % 5 == 0 || String.valueOf(number).contains("5"));
    }

    private boolean isDeluxe(Integer number) {
        return isFizz(number) || isBuzz(number);
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
