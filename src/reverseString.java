public class reverseString {

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
