package charecterIsDigitIsNumber;

public class FindDigit {

    public static int search_digit(String s)
    {

        // Function to check if is digit
        // is found or not
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(
                    s.charAt(i))
                    == true) {
                // return position of digit
                return i + 1;
            }
        }
        // return 0 if digit not present
        return 0;
    }

    public static void main(String[] args) {
        // Array of strings
        String[] arr = { "ABC4DEF", "QWERTY" };
        // To store the position of digit
        int index = 0;
        // Traverse the array arr[] to find digit
        // within it's elements
        for (String x : arr) {
            index = search_digit(x);
            if (index != 0) {
                System.out.println(
                        "Digit found at : "
                                + (index)
                                + "th position.");
            }
            else {
                System.out.println(
                        "Digit not present.");
            }
        }
    }
}
