package designPatterns.adapter;

public class PhonePe {

    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(String bankName) {
        this.bankAPIAdapter = AdapterFactory.getBankAPIAdapter("ICICI");
    }

    public void getBalance(){
        double balance = bankAPIAdapter.getBalance("userBankAccountId");
        System.out.println("Balance is : " + balance);
    }

    public void addBankAccount(){

    }

    public void transferAmount(){

    }

}
