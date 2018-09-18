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
            result.append("deluxe");
        }

//        if (isFizzBuzz(number)) {
//            return "fizz buzz";
//        }

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
