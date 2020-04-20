public class Rectangle {
    private int area;
    private int perimeter;
    private String color = "Red";
    private int  width=4;
    private int length=8;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }



    public int calculateArea(){
        area= length*width;
        return area;
    }
     public int calculatePerimeter(){
        perimeter=2*area;
        return perimeter;
     }
}
