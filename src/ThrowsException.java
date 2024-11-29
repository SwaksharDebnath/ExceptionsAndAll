import java.io.IOException;

public class ThrowsException {
    public static void main(String[] args) throws IOException {
        fun();

//        Either following: catch it or 'throws' it in method signature.
//        try {
//            fun();
//        } catch (IOException e) {
//            System.out.println("caught in main");
//        }

    }

    public static void fun() throws IOException {
        System.out.println("inside fun");
        throw new IOException();
        // Remember 'Throws' only used in case of checkedException.
    }
}
