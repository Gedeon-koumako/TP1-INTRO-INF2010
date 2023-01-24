package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {

    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {

    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {

    }

    /** TODO
     * Translate the Ellipse by the given 2D point
     * @param point The 2D point by which to translate
     * @return The translated Ellipse
     */
    @Override
    public Ellipse translate(Point2d point) {
        return null;
    }

    /** TODO
     * Rotate the Ellipse by the given angle (In Radians)
     * @param angle The angle by which to rotate
     * @return The rotated Ellipse
     */
    @Override
    public Ellipse rotate(Double angle) {
        return null;
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return null;
    }
}
