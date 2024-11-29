import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
        otherMethod();
    }

    public static void method1() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Oops");
        }
    }
    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void otherMethod() {
        // does not need to use 'throws' because ArithmeticException is a unchecked Exception.
        throw new ArithmeticException("Oops");
    }
}

/**
 * file reader gives checked exception, means it is checked in compile time.
 * So, the methods know that the code block throws exception. So We have to add it to methods signature.
 * And ones it added we must add to the calling methods as well.
 */