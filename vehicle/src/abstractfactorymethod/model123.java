package abstractfactorymethod;

public class model123 extends carfactory{
    public int price;
    public model123(int p) {
        this.price = p;
    }

    public double discountOnFestival()
    {
        return 0.1*price;
    }
    @Override
    public void music_system() {
        super.music_system();
    }

    @Override
    public void engine_capacity() {
        super.engine_capacity();
    }
    public void getPrice(){
        System.out.println("Price of model123 is " + this.price);
    }
    public void getDiscountOnFestival(){
        System.out.println("Discount for Price of model123 is " + this.price * 0.1);
    }
    public void car_type()
    {
        System.out.println("It's a sedan type ");
    }
}
