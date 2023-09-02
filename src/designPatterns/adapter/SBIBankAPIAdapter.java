package designPatterns.adapter;

public class SBIBankAPIAdapter implements  BankAPIAdapter{
    @Override
    public int getBalance(String userBankAccountId) {
        return 0;
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
