
public class Main {
  public static void main(String[] args) {

    // ***********************Debit Card check***************/
    System.out.println("***********************Debit Card check Start***************");

    // Create Debit card instance
    DebitCard debitCard = new DebitCard(1, "12345", "123456", 2000.0, "Person 1", 1234);

    // Inspect the DebitCard object
    debitCard.display();

    // Withdraw an amount of 500
    debitCard.withdraw(500, "01/01/2023", 1234);

    // Re-inspect the DebitCard object
    debitCard.display();

    System.out.printf("***********************Debit Card check Finish***************\n\n");

    // ***********************Credit Card check***************/
    System.out.println("***********************Credit Card check***************");

    // Create creditCard instance
    CreditCard creditCard = new CreditCard(12345, "Pratikshya", "ABC Bank", "123456", 1000.00, 123, 0.15, "01/01/2024");

    // Inspect the CreditCard object
    creditCard.display();

    // Set the credit limit and grace period
    creditCard.setCreditLimit(3000, 30);

    creditCard.display();

    // Cancel the credit card
    creditCard.cancelCreditCard();

    // Re-inspect the CreditCard object
    creditCard.display();

    System.out.printf("***********************Credit Card check Finish***************\n\n");

  }
}