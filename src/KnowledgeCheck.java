public class KnowledgeCheck {
    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("caught exception in main");
        }
    }

    public static void  fun() {
        try {
            throw new NullPointerException("try inside fun");
        } catch (NullPointerException e) {
            System.out.println("Caught in fun");
            throw e;
        }
    }
}
