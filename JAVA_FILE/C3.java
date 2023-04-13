public class C3 {
       //This program is Written by Piyush Goel 
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("The string is: " + str);


        System.out.println("The length of the string is: " + str.length());


        System.out.println("The character at index 4 is: " + str.charAt(4));


        System.out.println("The substring from index 6 to 10 is: " + str.substring(6, 11));


        System.out.println("The upper case version of the string is: " + str.toUpperCase());

 
        System.out.println("The lower case version of the string is: " + str.toLowerCase());

 
        System.out.println("The string is equal to \"Hello World\": " + str.equals("Hello World"));
        System.out.println("The string is equal to \"hello world\": " + str.equals("hello world"));

 
        System.out.println("The string compared to \"Hello World\" is: " + str.compareTo("Hello World"));
        System.out.println("The string compared to \"hello world\" is: " + str.compareTo("hello world"));
        System.out.println("The string compared to \"Hello Java\" is: " + str.compareTo("Hello Java"));

 
        System.out.println("The index of 'o' in the string is: " + str.indexOf('o'));
        System.out.println("The index of 'z' in the string is: " + str.indexOf('z'));


        System.out.println("The string after replacing 'l' with 'x' is: " + str.replace('l', 'x'));

 
        String str2 = "   Hello World   ";
        System.out.println("The string with spaces is: \"" + str2 + "\"");
        System.out.println("The string after trimming spaces is: \"" + str2.trim() + "\"");
    }
}
