public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        ca.balance = 1234.56;
        ca.name = "John Henry";
        System.out.println(ca.withdraw(40.0));

    }
}
