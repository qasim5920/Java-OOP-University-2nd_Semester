package Task3;

public class Triangle  {
    private double side1,side2,side3;

    public Triangle(double side1, double side2, double side3) throws QasimException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 >= side2 + side3) {
            throw new QasimException("Qasim exception");
        }
        else if((side2 >= side1 + side3)) {
            throw new QasimException("Qasim exception");
        }
        else if((side2 >= side1 + side3)) {
            throw new QasimException("Qasim exception");
        }
        else{
           toString();
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
