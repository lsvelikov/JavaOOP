package OOP.Encapsulation.box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setHeight(height);
        setWidth(width);
    }
    public double calculateSurfaceArea(){
        return (2 * getLength() * getWidth()) + (2 * getLength() * getHeight()) + (2 * getWidth() * getHeight());
    }
    public double calculateLateralSurfaceArea (){
        return (2 * getLength() * getHeight()) + (2 * getWidth() * getHeight());
    }
    public double calculateVolume(){
        return getLength() * getHeight() * getWidth();
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        if (!isValidInput(length)){
            throw new IllegalStateException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if (!isValidInput(width)){
            throw new IllegalStateException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if (!isValidInput(height)){
            throw new IllegalStateException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
    private boolean isValidInput(double input){
        return input > 0;
    }
}
