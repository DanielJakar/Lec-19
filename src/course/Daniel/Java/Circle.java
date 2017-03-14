package course.Daniel.Java;

/**
 * Created by Jakars on 14/03/2017.
 */
public class Circle {
    private double radius;

    public Circle(double radius) throws Exception {
        if (radius < 0)
            throw new Exception();
        this.radius = radius;
    }
}
