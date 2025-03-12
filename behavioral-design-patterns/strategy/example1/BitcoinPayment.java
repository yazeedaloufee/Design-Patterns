
class BitcoinPayment implements PaymentStrategy {
    private final String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin (" + walletAddress + ")");
    }
}
