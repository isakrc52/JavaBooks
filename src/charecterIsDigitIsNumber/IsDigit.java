package charecterIsDigitIsNumber;

public class IsDigit {
    public static void main(String[] args) {

        int cp1 = 74;
        int cp2 = 84;

        // Check whether the codePoints
        // are digit or not.
        System.out.println(
                "The codePoint cp1 is a digit -> "
                        + Character.isDigit(cp2));
        System.out.println(
                "The codePoint cp2 is a digit -> "
                        + Character.isDigit(cp1));

        int cp3=35;
        System.out.println("the codePoint cp3 a digit ->"+Character.isDigit(cp3));
    }
}
