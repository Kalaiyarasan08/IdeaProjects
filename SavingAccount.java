package abstractfactorypat;
public class SavingAccount implements BankAccount{
    double intrestRate;

    public SavingAccount(double ir)
    {
        this.intrestRate = ir;
        createAccount();
    }

    public void createAccount(){
        System.out.println("Creating a Savings Account");
    }

    public void getIntrestRate(){
        System.out.println("Intrest Rate for Savings Account is " + this.intrestRate + "% only." );
    }
}

