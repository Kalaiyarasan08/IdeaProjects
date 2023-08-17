package abstractfactorypat;
public class SavingAccountFactory{
    public static BankAccount createAccount(){
        return new SavingAccount(6.5);
    }
}
