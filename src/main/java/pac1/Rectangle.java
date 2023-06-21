package pac1;

/*
 * Klasa reprezentująca prostokąt.
 */
public class Rectangle {
    private double width;
    private double height;

    /*
     * Tworzy obiekt prostokąta o danej szerokości i wysokośći.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /*
     * Zwraca szerokość prostokąta.
     */
    public double getWidth() {
        return width;
    }

    /*
     * Zwraca wysokość prostokąta.
     */
    public double getHeight() {
        return height;
    }

    /*
     * Oblicza pole powierzchni prostokąta.
     */
    public double calculateArea() {
        return width * height;
    }
}
