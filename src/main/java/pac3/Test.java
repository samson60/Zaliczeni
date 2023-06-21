package pac3;



import pac1.Circle;
import pac1.Rectangle;
import pac2.Geometry;
/*
 * Klasa testująca funkcjonalność powyższych klas.
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        System.out.println("Pole powierzchni koła: " + circleArea);

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Pole powierzchni prostokąta: " + rectangleArea);

        double[] sides = {3.0, 4.0, 5.0};
        double perimeter = Geometry.calculatePerimeter(sides);
        System.out.println("Obwód trójkąta o bokach: " + sides[0] + ", " + sides[1] + ", " + sides[2] + " wynosi: " + perimeter);
    }
}