package abstractfactorymethod;
public abstract class Busfactory implements factories {

    @Override
    public void brake(){
        System.out.println("The bus brakes..");
    }
    @Override
    public void accelarator(){
        System.out.println("The bus accelerate");
    }
    public void breaking_system()
    {
        System.out.println("The bus has hydraulic breaking...");
    }
    public void emergency_windows()
    {
        System.out.println("The bus has emergency window...");
    }
}
