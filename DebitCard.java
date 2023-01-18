public class DebitCard extends BankCard {
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    // constructor
    public DebitCard(int cardId, String bankAccount, String issuerBank, double balanceAmount, String clientName,
            int pinNumber) {
        super(cardId, bankAccount, issuerBank, balanceAmount);
        setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }

    // accessor methods
    public int getPinNumber() {
        return pinNumber;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return hasWithdrawn;
    }

    // mutator method for withdrawal amount
    public void setWithdrawalAmount(int newWithdrawalAmount) {
        this.withdrawalAmount = newWithdrawalAmount;
    }

    // withdraw method
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int enteredPin) {
        if (enteredPin == this.pinNumber) {
            if (withdrawalAmount <= getBalanceAmount()) {
                setWithdrawalAmount(withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                setBalanceAmount(getBalanceAmount() - withdrawalAmount);
                hasWithdrawn = true;
            } else {
                System.out.println("Insufficient balance to complete the transaction");
            }
        } else {
            System.out.println("Invalid Pin entered, please try again");
        }
    }

    // display method
    public void display() {
        super.display();
        System.out.println("Pin number: " + pinNumber);

        // checking condition
        if (hasWithdrawn) {
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " + dateOfWithdrawal);
        } else {
            System.out.println("No withdrawal has been made yet");
        }
    }
}