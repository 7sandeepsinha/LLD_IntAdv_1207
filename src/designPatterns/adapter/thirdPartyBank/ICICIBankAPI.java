package designPatterns.adapter.thirdPartyBank;

public class ICICIBankAPI {
    public float checkBalance(String customerId){
        return 100.0f;
    }

    public char addBankAccount(BankAccountDetails bankAccountDetails){
        return 'Y';
    }

    public char makePayment(BankAccountDetails fromUser, BankAccountDetails toUser, double amount){
        return 'Y';
    }
}
