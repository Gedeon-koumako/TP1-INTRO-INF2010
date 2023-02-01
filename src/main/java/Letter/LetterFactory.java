package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter T graphically
     * @return BaseShape containing the letter T
     */
    public static BaseShape create_T() {
        Rectangle createT1 = new Rectangle(60.0,16.0);
        Rectangle createT2 = new Rectangle(16.0, 120.0);
        Point2d translationPoint = new Point2d(0.0, createT2.getMaxCoord().Y()/2);
        createT1.translate(translationPoint);

        return createT1.add(createT2);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter V graphically
     * @return BaseShape containing the letter V
     */
    public static BaseShape create_V() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        return new BaseShape();
    }

    /** TODO
     * Create the letter M graphically
     * @return BaseShape containing the letter M
     */
    public static BaseShape create_M() {
        return new BaseShape();
    }

}
