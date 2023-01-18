
public class BankCard {
    private int cardId;
    private String bankAccount;
    private String issuerBank;
    private String clientName;
    private double balanceAmount;

    // constructor
    public BankCard(int cardId, String bankAccount, String issuerBank, double balanceAmount) {
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";
    }

    // getters
    public int getCardId() {
        return cardId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getIssuerBank() {
        return issuerBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    // ************************ setters ********************************/
    public void setClientName(String newClientName) {
        this.clientName = newClientName;
    }

    public void setBalanceAmount(double balance) {
        this.balanceAmount = balance;
    }

    // display method
    public void display() {
        System.out.printf("Card ID: " + cardId);
        System.out.println("Issuer bank: " + issuerBank);
        if (clientName.equals("")) {
            System.out.println("Client name: Not assigned");
        } else {
            System.out.println("Client name: " + clientName);
        }
        System.out.println("Bank account: " + bankAccount);
        System.out.println("Balance amount: " + balanceAmount);
    }
}