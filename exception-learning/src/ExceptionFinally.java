public class ExceptionFinally {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hi..");
        try {
            System.out.println(getResult());
        } catch (Exception e) {
            System.out.println("Printing...");
            // e.printStackTrace();
            // System.exit(0);
        } finally {
            System.out.println("Sleeping for 10 seconds.");
            Thread.sleep(10000);
            System.out.println("Finally!");
        }
        System.out.println("Sleeping for 5 seconds.");
        Thread.sleep(5000);
        System.out.println("Bye.");
    }

    private static boolean getResult() throws Exception {
        throw new Exception();
    }
}
