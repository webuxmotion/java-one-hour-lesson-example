package oneHourJavaLesson;

public class Product extends Paper {
    int price;
    String color;

    Product(int width, int height, int price, String color) {
        super(width, height);

        this.price = price;
        this.color = color;
    }

    public String toString() {

        return "Paper size: "
                .concat(Integer.toString(this.width))
                .concat("x")
                .concat(Integer.toString(this.height))
                .concat(";")
                .concat(" Color: " + this.color + ";")
                .concat(" Price: " + Integer.toString(this.price) + ";");
    }
}
