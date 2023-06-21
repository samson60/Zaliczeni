package pac2;

/*
 * Klasa do obloczeń geometrycznych.
 */
public class Geometry {
    /*
     * Oblicza obwód na podstawie tablicy boków.
     */
    public static double calculatePerimeter(double[] sides) {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
