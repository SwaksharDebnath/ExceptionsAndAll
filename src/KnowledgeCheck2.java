public class KnowledgeCheck2 {
    public static void main(String[] args) {
        fun();
    }
    public static void fun() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("exception from a");
        } finally {
            try {
                int b = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("exception from b");
            } finally {
                System.out.println("finally");
            }
        }
    }
}
