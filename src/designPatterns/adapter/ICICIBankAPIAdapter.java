package designPatterns.adapter;

import designPatterns.adapter.thirdPartyBank.BankAccountDetails;
import designPatterns.adapter.thirdPartyBank.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{

    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAPIAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public int getBalance(String userBankAccountId) {
        // get customerId from userBankAccountId
        int balance = (int)iciciBankAPI.checkBalance("customerId");
        return balance;
    }

    @Override
    public boolean addBankAccount(String userName, String bankAccountNumber) {
        String ifsc = " "; //write logic to get ifsc from accountNumber
        BankAccountDetails bankAccountDetails = new BankAccountDetails(userName, bankAccountNumber, ifsc);
        char result = iciciBankAPI.addBankAccount(bankAccountDetails);
        return result == 'Y';
    }

    @Override
    public boolean transfer(String fromUserName, String toUserName, int amount) {
        BankAccountDetails fromUser = new BankAccountDetails(fromUserName, "" , "");
        BankAccountDetails toUser = new BankAccountDetails(toUserName, "" , "");
        double amountTransfer = amount;
        char result = iciciBankAPI.makePayment(fromUser, toUser, amountTransfer);
        return result == 'Y';
    }
}
