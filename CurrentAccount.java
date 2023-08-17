package abstractfactorypat;
public class CurrentAccount implements BankAccount{
    double intrestRate;

    public CurrentAccount(double ir)
    {
        this.intrestRate = ir;
        createAccount();
    }

    public void createAccount(){
        System.out.println("Creating a Current Account");
    }

    public void getIntrestRate(){
        System.out.println("Intrest Rate for Current Account is " + this.intrestRate + "% only." );
    }
}

