public class Main {
    public static void main(String[] args) {
        int[] numerators = {10, 20, 30, 40};
        int[] denominators = {5, 10, 0, 30};

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Result is: " +  divide(numerators[i], denominators[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    public static int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e);
            return 0;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}