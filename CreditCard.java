public class CreditCard extends BankCard {
    private int CVCnumber;
    private int creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;



    // constructor
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int CVCnumber, double interestRate, String expirationDate) {
        super(cardId, bankAccount, issuerBank,balanceAmount);
        setClientName(clientName);
        this.CVCnumber = CVCnumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    //******************************getter methods******************************
    public int getCVCnumber() {
        return CVCnumber;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public boolean getIsGranted() {
        return isGranted;
    }

    //******************************setters methods******************************

    //setCreditLimit-> method to credit limit
    public void setCreditLimit(int newCreditLimit, int newGracePeriod) {
        //credit limit cannot be greater than certain amount 
        if (newCreditLimit <= (2.5 * getBalanceAmount())) {
            this.creditLimit = newCreditLimit;
            this.gracePeriod = newGracePeriod;
            this.isGranted = true;
        } else {
            System.out.println("Credit limit cannot be issued");
        }
    }

    //cancel credit card method
    public void cancelCreditCard() {

        //setting everything to initial
        if (getIsGranted()) {
            this.CVCnumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
        } else {
            System.out.println("No credit card available to cancel");
        }
    }

    //display method 
    public void display() {
        //calls Bankcard class 
        super.display();
        

        System.out.println("CVC number: " + CVCnumber);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Expiration date: " + expirationDate);

        //checking condition
        if (isGranted) {
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Grace period: " + gracePeriod);
        } else {
            System.out.println("Credit limit and grace period not granted");
        }
    }

}