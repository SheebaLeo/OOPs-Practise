package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        BankAccount bankAccount = new BankAccount("100", 200.00, "Amira", "abc@dhd", "12345678");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.deposit(100));
        System.out.println(bankAccount.withdrawAmount(300));
    }
}
