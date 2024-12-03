package AdapterPattern.adapter;

import AdapterPattern.bankInterface.BankApi;
import AdapterPattern.components.YesBankApi;
import AdapterPattern.dto.BankDetails;

public class YesBankAdapter implements BankApi{

    private YesBankApi yesBankApi;

    public YesBankAdapter() {
        yesBankApi = new YesBankApi();
    }

    @Override
    public String getBalance(String upiNumber, int pin) {
        return String.valueOf(yesBankApi.fetchBalance(upiNumber, 
                                                      String.valueOf(pin)));   
    }

    @Override
    public String createAccount(BankDetails bankDetails, int pin, int otp) {
        int result = yesBankApi.createAccount(String.valueOf(pin), 
                                              bankDetails.getUpiNumber(), 
                                              bankDetails.getAccountNumber());
        switch(result) {
            case 1 : return "Successfully cerated a new bank account";
            default : throw new RuntimeException("Error while creating bank account");
        }
    }

    @Override
    public String makeTransaction(String fromUpiId, String toUpiId, double amount, int pin) {
        return yesBankApi.makeTransfer(String.valueOf(amount), 
                                       String.valueOf(pin), 
                                       fromUpiId, 
                                       toUpiId);
    }
}
