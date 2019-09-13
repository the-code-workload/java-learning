public class BankAccountMultiThreading {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread thread1 = new Thread(new BankAccountManager(bankAccount));
        Thread thread2 = new Thread(new BankAccountManager(bankAccount));
        thread1.start();
        thread2.start();

    }
}
