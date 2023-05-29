
// Example 3: Using throws to declare the exceptions that a method may throw.public class Jav34c {
    public static void main(String[] args) {
        try {
            // Call a method that may throw an IOException
            readFile("test.txt");
        } catch (IOException e) {
            // Handle the exception
            System.out.println("File not found");
        }
    }

    // Declare that this method may throw an IOException
    public static void readFile(String fileName) throws IOException {
        // Try to open the file
        FileInputStream fis = new FileInputStream(fileName);
        // Do some operations on the file
        // ...
        // Close the file
        fis.close();
    }
}
