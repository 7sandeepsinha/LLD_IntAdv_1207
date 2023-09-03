package designPatterns.adapter.thirdPartyBank;

public class YesBankAPI {
    public float balance(String userBankAccountId){
        return 100.0f;
    }

    public void updateBankAccountDetails(String userName, String accountNumber){
        //if something goes wrong might throw exception
    }

    public double pay(String fromUserId, String toUserId, double amount){
        return 1;
    }
}
