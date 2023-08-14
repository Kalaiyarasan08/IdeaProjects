public class Jaguar implements vehicle {

    String name;

    public Jaguar(String name){
        this.name = name;
    }


    public void accelerate() {
        System.out.println(name + " is accelerating.");
    }


    public void breaking() {
        System.out.println(name + " is breaking.");
    }
}
