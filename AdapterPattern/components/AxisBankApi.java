package AdapterPattern.components;

public class AxisBankApi {
    public double getBalance(String upiId, int pin) {
        return 100.00;
    }

    public void addAcount(String bankAcountNumber, String debitCard, int otp, int pin) {
        return;
    }
    public char trasnferPayment(String fromUpiId, String toUpiId, int pin, double amount) {
        return 'Y';
    }
}
