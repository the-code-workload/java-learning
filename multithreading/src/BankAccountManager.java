public class BankAccountManager implements Runnable {

    BankAccount bankAccount;

    public BankAccountManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;

    }



    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            bankAccount.add(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Bank Acocunt is:"+bankAccount.count );

    }
}
