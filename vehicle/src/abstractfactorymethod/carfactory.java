package abstractfactorymethod;

public abstract class carfactory implements factories {
    @Override
    public void brake(){
        System.out.println("The car brakes..");
    }
    @Override
    public void accelarator(){
        System.out.println("The car accelerate");
    }

    public void music_system()
    {
        System.out.println("The music plays");
    }

    public void engine_capacity()
    {
        System.out.println("The speed goes to 1200cc..");
    }


}