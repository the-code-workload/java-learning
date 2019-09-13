public class ThreadTestEx1 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyTask1());
        Thread thread2 = new Thread(new MyTask2());

        thread1.start();
        thread2.start();
    }




}
