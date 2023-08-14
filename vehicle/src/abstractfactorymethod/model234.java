package abstractfactorymethod;

public class model234 extends Busfactory {
    public int price;
    public model234(int p) {
        this.price = p;
    }

    @Override
    public void breaking_system() {
        super.breaking_system();
    }

    @Override
    public void emergency_windows() {
        super.emergency_windows();
    }
    public void getPrice(){
        System.out.println("Price of model234 is " + this.price);
    }
    public void getDiscountOnFestival(){
        System.out.println("Discount for Price of model234 is " + this.price * 0.1);
    }

    public void refrigeration_type()
    {
        System.out.println("It's an AC Bus");
    }
}
