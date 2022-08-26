public class SavingsBond {
    //utilized oracle's code as a reference, was unsure how bonds actually worked
    double interestRate, balance;
    int monthsG, monthsLeft;

    //determines the interest rate
    public void purchaseBond (int months) {
        if (months>=0 && months <= 11) {
            interestRate = 0.005;
        }
        else if (months >=12 && months <=23) {
            interestRate = 0.01;
        }
        else if (months >=24 && months <=35) {
            interestRate = 0.01;
        }
        else if (months >=36 && months <=47) {
            interestRate = 0.01;
        }
        else if (months >=48 && months <=60) {
            interestRate = 0.01;
        }
        else {
            System.out.println("Not a valid month range");
        }

        monthsG = months;
        monthsLeft = months;
    }

    //decides how much interest has yet to accumulate/matures bond
    public void acquireInterest() {
        if (monthsLeft > 0) {
            balance += balance * interestRate /12;
            monthsLeft--;
            System.out.println("Balance: $" + balance);
            System.out.println("Rate: " + interestRate);
            System.out.println("Months left: "+monthsLeft);
        }
        else {
            System.out.println("Your bond has matured");
        }
    }
}
