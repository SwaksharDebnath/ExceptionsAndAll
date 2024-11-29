public class ShowStackTrace {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            System.out.println(e.getMessage());
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                System.out.println(stackTraceElement);
            }
        }
    }

    public static void level3() {
        int[] arr = new int[10];
        arr[10] = 5;
    }
    public static void level2() {
        level3();
    }
    public static void level1() {
        level2();
    }
}
