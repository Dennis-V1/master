
public class YourFirstAccount {

    public static void main(String[] args) {

        Account account = new Account("Barto's account", 100.0);
 
        account.deposit(20);
        System.out.println(account);

    }
}
