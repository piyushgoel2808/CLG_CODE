public class C5 {
        //This program is Written by Piyush Goel
    public static void main(String[] args) {
        StringDemo s1 = new StringDemo();
        s1.length();
        s1.chara();
        s1.equal();
        
}}
class StringDemo {

 
        // Declare and initialize three strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        // Print the strings
        // System.out.println("The first string is: " + str1);
        // System.out.println("The second string is: " + str2);
        // System.out.println("The third string is: " + str3);


 public void length(){
        // Use the length function to get the number of characters in each string
        System.out.println("\nThe length of the first string is: " + str1.length());
        System.out.println("The length of the second string is: " + str2.length());
        System.out.println("The length of the third string is: " + str3.length());
 }
 public void chara(){
        // Use the charAt function to get the character at a specified index in each string
        System.out.println("\nThe character at index 0 in the first string is: " + str1.charAt(0));
        System.out.println("The character at index 1 in the second string is: " + str2.charAt(1));
        System.out.println("The character at index 2 in the third string is: " + str3.charAt(2));}


        public void equal(){
        // Use the equals function to compare the strings for equality
        System.out.println("\nThe first string is equal to the second string: " + str1.equals(str2));
        System.out.println("The first string is equal to the third string: " + str1.equals(str3));
        System.out.println("The second string is equal to the third string: " + str2.equals(str3));
    }
}

