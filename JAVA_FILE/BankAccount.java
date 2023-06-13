// public class BankAccount {
public class BankAccount {
    private double balance; // the current balance of the account

    public BankAccount(double initialBalance) {
        balance = initialBalance; // set the initial balance
    }

    public void deposit(double amount) {
        balance += amount; // add the amount to the balance
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < 1000) { // check if the balance will drop below 1000
            throw new InsufficientFundsException("Cannot withdraw more than " + (balance - 1000)); // throw an exception
                                                                                                   // with a message
        }
        balance -= amount; // subtract the amount from the balance
    }

    public double getBalance() {
        return balance; // return the current balance
    }

    public class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message); // call the superclass constructor with the message
        }

    }
}
// }