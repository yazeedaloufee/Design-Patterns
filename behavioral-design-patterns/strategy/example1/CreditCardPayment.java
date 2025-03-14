public class CreditCardPayment implements PaymentStrategy{
    private final String cardNumber;
    private final String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card (" + cardNumber + ", " + name + ")");
    }
}
