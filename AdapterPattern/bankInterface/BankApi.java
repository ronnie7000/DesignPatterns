package AdapterPattern.bankInterface;

import AdapterPattern.dto.BankDetails;

public interface BankApi {
    String getBalance(String upiNumber, int pin);
    String createAccount(BankDetails bankDetails, int pin, int otp); 
    String makeTransaction(String fromUpiId, String toUpiId, double amount, int pin);
}
