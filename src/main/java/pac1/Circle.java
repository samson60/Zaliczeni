package pac1;

/*
 * Klasa reprezentująca koło.
 */
public class Circle {
    private double radius;

    /*
     * Tworzy okbiekt koła o danym promieniu.
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    /*
     * Zwraca promień koła.
     */
    public double getRadius() {
        return radius;
    }
    /*
     * Oblicza pole powierzchni koła.
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

