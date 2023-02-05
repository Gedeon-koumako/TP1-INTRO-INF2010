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

    final static double barVerticalHeight = 120;
    final static double barVerticalWidth = 16;
    final static double barHorizontalHeight = 16;
    final static double barHorizontalWidth = 60;
    final static double ObliqueBarHeight = 120;
    final static double ObliqueBarWidth = 10;


    public static Rectangle newBarHorizontal() {
        return new Rectangle(barHorizontalWidth, barHorizontalHeight);
    }
    public static Rectangle newBarVertical() {
        return new Rectangle(barVerticalWidth, barVerticalHeight);
    }

    public static Rectangle newBarOblique(Rectangle obliqueBar, Double angle){
        return obliqueBar.rotate(angle);
    }

    /** TODO
     * Create the letter T graphically
     * @return BaseShape containing the letter T
     */
    public static BaseShape create_T() {
        Rectangle barHorizontal = newBarHorizontal();
        Rectangle barVertical = newBarVertical();
        barHorizontal.translate(new Point2d(0.0, -50.));
        return barVertical.add(barHorizontal);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {

        Rectangle barVertical = newBarVertical();
        barVertical.translate(new Point2d(-(barHorizontalWidth /2 - barVerticalWidth /2), 0.));
        Rectangle barHorizontalHaut = newBarHorizontal();
        barHorizontalHaut.translate(new Point2d(0.0, - (barVerticalHeight /2 - barHorizontalHeight /2)));
        barVertical.add(barHorizontalHaut);
        Rectangle barHorizontalMilieu = newBarHorizontal();
        barVertical.add(barHorizontalMilieu);
        Rectangle barHorizontalBas = newBarHorizontal();
        barHorizontalBas.translate(new Point2d(0.0,  barVerticalHeight /2 - barHorizontalHeight /2 ));
        barVertical.add(barHorizontalBas);
        return barVertical;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse fullEllipse = new Ellipse(60.0,130.0);
        Ellipse halfEllipse = new Ellipse(40.0,(130.0 *2)/3);
        return fullEllipse.remove(halfEllipse);
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape OEllipse = create_O();
        Rectangle barHorizontalMilieu = newBarOblique(newBarHorizontal(),Math.PI / 2);
        barHorizontalMilieu.translate(new Point2d((barHorizontalWidth /2 - barVerticalWidth /2), 0.));
        return OEllipse.remove(barHorizontalMilieu);
    }

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        Rectangle createT1 = newBarHorizontal();
        createT1.translate(new Point2d(0.,30.));
        Rectangle leftVerticalBar = newBarVertical();
        leftVerticalBar.translate(new Point2d(-(barHorizontalWidth /2.5 - barVerticalWidth /2), 0.));
        leftVerticalBar.rotate(Math.PI /12);
        Rectangle rightVerticalBar = newBarVertical();
        rightVerticalBar.translate(new Point2d((barHorizontalWidth /2.5 - barVerticalWidth /2), 0.));
        rightVerticalBar.rotate( -Math.PI / 12);

        return createT1.add(rightVerticalBar.add(leftVerticalBar));
    }

    /** TODO
     * Create the letter V graphically
     * @return BaseShape containing the letter V
     */
    public static BaseShape create_V() {
        Rectangle leftVerticalBar = newBarOblique(newBarVertical(),-Math.PI /9);
        leftVerticalBar.translate(new Point2d(-(barHorizontalWidth /2 - barVerticalWidth /1.5), 0.));
        Rectangle rightVerticalBar = newBarOblique(newBarVertical(),Math.PI /9);
        rightVerticalBar.translate(new Point2d((barHorizontalWidth /2 - barVerticalWidth /1.5), 0.));
        return rightVerticalBar.add(leftVerticalBar);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle leftVerticalBar = newBarVertical();
        leftVerticalBar.translate(new Point2d(-(barHorizontalWidth /2 - barVerticalWidth /2), 0.));
        Rectangle rightVerticalBar = newBarVertical();
        rightVerticalBar.translate(new Point2d((barHorizontalWidth /2 - barVerticalWidth /2), 0.));
        Rectangle barOblique = newBarOblique(newBarVertical(),-Math.PI / 12);
        rightVerticalBar.add(barOblique);
        return rightVerticalBar.add(leftVerticalBar);
    }

    /** TODO
     * Create the letter M graphically
     * @return BaseShape containing the letter M
     */
    public static BaseShape create_M() {
        Rectangle leftVerticalBar = newBarVertical();
        leftVerticalBar.translate(new Point2d(-(barHorizontalWidth /2 - barVerticalWidth /3), 0.));
        Rectangle rightVerticalBar = newBarVertical();
        rightVerticalBar.translate(new Point2d((barHorizontalWidth /2 - barVerticalWidth /3), 0.));
        rightVerticalBar.add(leftVerticalBar);
        Rectangle leftObliqueBar = newBarOblique(new Rectangle(ObliqueBarWidth/4, ObliqueBarHeight),-Math.PI / 25 );
        Rectangle rightObliqueBar = newBarOblique(new Rectangle(ObliqueBarWidth/4, ObliqueBarHeight),Math.PI / 25 );
        leftObliqueBar.translate(new Point2d(-10., 0.));
        rightObliqueBar.translate(new Point2d(10., 0.));
        leftObliqueBar.add(rightObliqueBar);
        rightVerticalBar.add(leftObliqueBar);
        return rightVerticalBar;
    }

}
