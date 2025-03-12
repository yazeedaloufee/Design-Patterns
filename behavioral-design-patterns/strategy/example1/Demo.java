public class Demo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        context.executePayment(50);

        context.setPaymentStrategy(new PayPalPayment("yazeed@gmail.com"));
        context.executePayment(100);

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "yazeed aloufee"));
        context.executePayment(1000);

    }


}
