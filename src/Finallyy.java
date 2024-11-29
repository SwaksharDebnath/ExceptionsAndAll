public class Finallyy {
    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }
    public static int divide(int a, int b) {
        try {
            return a/b;
        } catch (Exception e) {
            return -1;
        } finally {
            // this block will be executed must whether or not try or catch executed.
            System.out.println("finally block");
        }
    }
}
