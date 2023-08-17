package abstractfactorypat;
public class Main{
    public static void main(String[] args) {


        SavingAccount sa = (SavingAccount) SavingAccountFactory.createAccount();
        sa.getIntrestRate();

        CurrentAccount ca = (CurrentAccount) CurrentAccountFactory.createAccount();
        ca.getIntrestRate();

        LoanAccount la = (LoanAccount) LoanAccountFactory.createAccount();
        la.getIntrestRate();
    }
}
