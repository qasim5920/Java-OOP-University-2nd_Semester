package Task2;

public class Staff extends Person {
    private double pay;

    public Staff(String name, Address address, double pay) {
        super(name, address);
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }
}
