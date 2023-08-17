package abstractfactorypat;
public class CurrentAccountFactory {
    public static BankAccount createAccount(){
        return new CurrentAccount(7.5);
    }
}
