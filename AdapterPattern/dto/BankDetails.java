package AdapterPattern.dto;

public class BankDetails {
    String accountNumber;
    String ifscCode;
    String debitCard;
    String upiNumber;

    public String getUpiNumber() {
        return upiNumber;
    }
    public void setUpiNumber(String upiNumber) {
        this.upiNumber = upiNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getDebitCard() {
        return debitCard;
    }
    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }
}
