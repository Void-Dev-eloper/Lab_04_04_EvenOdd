public class Main {
    public static void main(String[] args) {

        /*
A program that starts with a credit card balance of $5000 and then calculates the interest
at a rate of 17%.  Assume the user does not make any payments.
Display the interest due after one month and again after two months.
        */

        double INTEREST_RATE = .17;
        double creditCardBalance = 5000;
        double firstMonth;
        double secondMonth;
        double interest;

        interest = creditCardBalance * INTEREST_RATE;
        firstMonth = creditCardBalance + interest;
        System.out.println("First Month: $" + firstMonth);

        interest = firstMonth * INTEREST_RATE;
        secondMonth = firstMonth + interest;
        System.out.println("Second Month: $" + secondMonth);


    }
}