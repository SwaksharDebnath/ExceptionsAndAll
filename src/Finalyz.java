import java.io.*;

public class Finalyz {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("a.txt"));
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IO exception caught: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    // need to close it, if in case, there is a return statement in try/catch block.
                    // So, basically we will be using for closing things like: db connections or managing life cycles etc.
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
