package designPatterns.adapter.thirdPartyBank;

public class BankAccountDetails {
    private String userName;
    private String accountNumber;
    private String ifscCode;

    public BankAccountDetails(String userName, String accountNumber, String ifscCode) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public BankAccountDetails() {
    }
}
