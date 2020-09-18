package sharpieSet;

public class Sharpie {

    private String sharpie;
    private String color;
    private float width;
    private float inkAmount;

    public Sharpie () {

    }

    public Sharpie (String sharpie) {
        this.sharpie = sharpie;
        this.inkAmount = 100f;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setWidth (float width) {
        this.width = width;
    }

    public void setInkAmount (float inkAmount) {
        this.inkAmount = inkAmount;
    }

    public String getColor () {
        return color;
    }

    public float getInkAmount () {
        return inkAmount;
    }

    public float getWidth () {
        return width;
    }

    public void use () {
        inkAmount --;
    }

    public String toString () {
        return getColor() + ", " + width + ", " + inkAmount;
    }
    /*Create Sharpie class
    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    When creating one, we need to specify the color and the width
    Every sharpie is created with a default 100 as inkAmount
    We can use() the sharpie objects
    which decreases inkAmount*/
}
