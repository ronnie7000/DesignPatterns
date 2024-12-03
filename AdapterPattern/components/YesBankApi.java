package AdapterPattern.components;

public class YesBankApi {
    public String fetchBalance(String upiNumber, String pin) {
        return "100.00";
    }

    public int createAccount(String pin, String upiNumber, String bankAccount) {
        return 1;
    }

    public String makeTransfer(String amount, String pin, String fromUpiNumber, String toUpiNumber) {
        return "Successfull";
    }

}
