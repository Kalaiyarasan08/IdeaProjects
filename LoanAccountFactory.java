package abstractfactorypat;
public class LoanAccountFactory{
    public static BankAccount createAccount(){
        return new LoanAccount(10.2);
    }
}