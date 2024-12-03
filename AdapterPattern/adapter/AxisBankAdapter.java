package AdapterPattern.adapter;

import AdapterPattern.bankInterface.BankApi;
import AdapterPattern.components.AxisBankApi;
import AdapterPattern.dto.BankDetails;

public class AxisBankAdapter implements BankApi{

    private AxisBankApi axisBankApi;

    public AxisBankAdapter() {
        axisBankApi = new AxisBankApi();
    }

    @Override
    public String getBalance(String upiNumber, int pin) {
        return String.valueOf(axisBankApi.getBalance(upiNumber, 
                                                     pin));
    }

    @Override
    public String createAccount(BankDetails bankDetails, int pin, int otp) {
        try{
            axisBankApi.addAcount(bankDetails.getAccountNumber(), 
                                  bankDetails.getDebitCard(), 
                                  otp, 
                                  pin);

            return "Successfully opened new bank account";
        }
        catch(Exception e) {
            throw new RuntimeException("Unable to create new bank account at the moment");
        }
    }

    @Override
    public String makeTransaction(String fromUpiId, String toUpiId, double amount, int pin) {
        char result = axisBankApi.trasnferPayment(fromUpiId, 
                                                  toUpiId, 
                                                  pin, 
                                                  amount);
        switch(result) {
            case 'Y' : return "Transaction completed succesfully";
            default : throw new RuntimeException("Error while completing transaction");
        }
    }


}
