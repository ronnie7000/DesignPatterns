package AdapterPattern;

import AdapterPattern.adapter.AxisBankAdapter;
import AdapterPattern.bankInterface.BankApi;
import AdapterPattern.dto.BankDetails;

public class Main {

    public static void main(String[] args) {

        //Adaptor can be changed to quickly switch to different implementation for bank api
        BankApi bankApi = new AxisBankAdapter();

        BankDetails bankDetails = new BankDetails();
        bankDetails.setAccountNumber("ACC1");
        bankDetails.setDebitCard("D1");
        bankDetails.setIfscCode("I1");
        bankDetails.setUpiNumber("U1");


        System.out.println(bankApi.createAccount(bankDetails, 1001, 1234));
        
    }
}
