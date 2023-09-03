package designPatterns.adapter;

import designPatterns.adapter.thirdPartyBank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{

    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public int getBalance(String userBankAccountId) {
        return (int)yesBankAPI.balance(userBankAccountId);
    }

    @Override
    public boolean addBankAccount(String userName, String bankAccountNumber) {
        return false;
    }

    @Override
    public boolean transfer(String fromUserName, String toUserName, int amount) {
        return false;
    }
}
