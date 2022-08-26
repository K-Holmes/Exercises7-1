public class CheckingAccount {
    static double balance;
    String name;

    public static String withdraw(double withdrawAmount) {
        double originalBalance = balance;
        String message;
        if (withdrawAmount > balance) {
            message = "Balance is too low";
        }
        else if (withdrawAmount < 0) {
            message = "Cannot withdraw negative amounts";
        }
        else {
            balance = balance - withdrawAmount;
            message = withdrawAmount + " taken from " + originalBalance + ". New balance: " + balance;
        }
        return message;
    }
}
