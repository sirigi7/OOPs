package stockmanagement;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("John Smith", 1000.0);

        account.debit(500.0); // should withdraw successfully
        System.out.println("Name: " + account.getName());
        System.out.println("Balance: $" + account.getBalance());

        account.debit(700.0); // should fail due to insufficient balance
        System.out.println("Name: " + account.getName());
        System.out.println("Balance: $" + account.getBalance());
    }
}
