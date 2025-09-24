public class StringDemo {

    public static void main(String[] args) {
        // Declare and initialize a String object
        String str = "Hello World";

        // Print the string
        System.out.println("The string is: " + str);

        // 1. length() - returns the number of characters in the string
        System.out.println("The length of the string is: " + str.length());

        // 2. charAt(int index) - returns the character at the specified index in the string
        System.out.println("The character at index 4 is: " + str.charAt(4));

        // 3. substring(int beginIndex, int endIndex) - returns a new string that is a substring of the original string from beginIndex (inclusive) to endIndex (exclusive)
        System.out.println("The substring from index 6 to 10 is: " + str.substring(6, 11));

        // 4. toUpperCase() - returns a new string that is converted to upper case
        System.out.println("The upper case version of the string is: " + str.toUpperCase());

        // 5. toLowerCase() - returns a new string that is converted to lower case
        System.out.println("The lower case version of the string is: " + str.toLowerCase());

        // 6. equals(Object obj) - returns true if the string is equal to the specified object, false otherwise
        System.out.println("The string is equal to \"Hello World\": " + str.equals("Hello World"));
        System.out.println("The string is equal to \"hello world\": " + str.equals("hello world"));

        // 7. compareTo(String anotherString) - returns a negative integer, zero, or a positive integer as the string is lexicographically less than, equal to, or greater than the specified string
        System.out.println("The string compared to \"Hello World\" is: " + str.compareTo("Hello World"));
        System.out.println("The string compared to \"hello world\" is: " + str.compareTo("hello world"));
        System.out.println("The string compared to \"Hello Java\" is: " + str.compareTo("Hello Java"));

        // 8. indexOf(int ch) - returns the index of the first occurrence of the specified character in the string, or -1 if not found
        System.out.println("The index of 'o' in the string is: " + str.indexOf('o'));
        System.out.println("The index of 'z' in the string is: " + str.indexOf('z'));

        // 9. replace(char oldChar, char newChar) - returns a new string that is obtained by replacing all occurrences of oldChar with newChar in the original string
        System.out.println("The string after replacing 'l' with 'x' is: " + str.replace('l', 'x'));

        // 10. trim() - returns a new string that is obtained by removing any leading and trailing whitespace from the original string
        String str2 = "   Hello World   ";
        System.out.println("The string with spaces is: \"" + str2 + "\"");
        System.out.println("The string after trimming spaces is: \"" + str2.trim() + "\"");
    }
}