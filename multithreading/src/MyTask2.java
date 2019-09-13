public class MyTask2 implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
