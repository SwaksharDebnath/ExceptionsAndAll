import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources {
    public static void main(String[] args) {
        /**
         * As BufferedReader implements autoClosable interface, it will be automatically close the reader.
         * No need to use finally block.
         * It is called try with resources.
         */
        try(BufferedReader reader = new BufferedReader(new FileReader("a.txt"))) {
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
