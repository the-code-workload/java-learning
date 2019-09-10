public class Application {

    public static void main(String[] args) {

        int i = function1();
        System.out.println(i);

    }

    private static int function1() {
        int j = function2();
        return j*20;
    }

    private static int function2() {
        int a = 10;
        a = 10*23;
        return a;
    }
}
