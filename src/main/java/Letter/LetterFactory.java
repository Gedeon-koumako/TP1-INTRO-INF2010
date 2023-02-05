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

    final static double hauteurBarVertical = 120;
    final static double largeurBarVertical = 16;
    final static double hauteurBarHorizontal = 16;
    final static double largeurBarHorizontal = 60;
    final static double hauteurBarOblique = 120;
    final static double largeurBarOblique = 10;

    /** TODO
     * Create the letter T graphically
     * @return BaseShape containing the letter T
     */
    public static BaseShape create_T() {
        Rectangle createT1 = new Rectangle(60.0,16.0);
        Rectangle createT2 = new Rectangle(largeurBarVertical, hauteurBarVertical);
        createT1.translate(new Point2d(0.0, -50.));

        return createT2.add(createT1);
        //return createT2;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {

        Rectangle barVertical = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVertical.translate(new Point2d(-(largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        Rectangle barHorizontalHaut = new Rectangle(largeurBarHorizontal,hauteurBarHorizontal);
        barHorizontalHaut.translate(new Point2d(0.0, - (hauteurBarVertical/2 - hauteurBarHorizontal/2)));
        barVertical.add(barHorizontalHaut);
        Rectangle barHorizontalMilieu = new Rectangle(largeurBarHorizontal,hauteurBarHorizontal);
        barVertical.add(barHorizontalMilieu);
        Rectangle barHorizontalBas = new Rectangle(largeurBarHorizontal,hauteurBarHorizontal);
        barHorizontalBas.translate(new Point2d(0.0,  hauteurBarVertical/2 - hauteurBarHorizontal/2 ));
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
        Ellipse fullEllipse = new Ellipse(60.0,130.0);
        Ellipse halfEllipse = new Ellipse(40.0,(130.0 *2)/3);
        fullEllipse.remove(halfEllipse);
        Rectangle barHorizontalMilieu = new Rectangle(largeurBarHorizontal,hauteurBarHorizontal);
        barHorizontalMilieu.rotate(Math.PI / 2);
        barHorizontalMilieu.translate(new Point2d((largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        return fullEllipse.remove(barHorizontalMilieu);
    }

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        Rectangle createT1 = new Rectangle(60.0,16.0);
        createT1.translate(new Point2d(0.,30.));
        Rectangle barVerticalGauche = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalGauche.translate(new Point2d(-(largeurBarHorizontal/2.5 - largeurBarVertical/2), 0.));
        barVerticalGauche.rotate(Math.PI /12);
        Rectangle barVerticalDroite = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalDroite.translate(new Point2d((largeurBarHorizontal/2.5 - largeurBarVertical/2), 0.));
        barVerticalDroite.rotate( -Math.PI / 12);

        return createT1.add(barVerticalDroite.add(barVerticalGauche));
    }

    /** TODO
     * Create the letter V graphically
     * @return BaseShape containing the letter V
     */
    public static BaseShape create_V() {
        Rectangle barVerticalGauche = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalGauche.translate(new Point2d(-(largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        barVerticalGauche.rotate(-Math.PI /9);
        Rectangle barVerticalDroite = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalDroite.translate(new Point2d((largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        barVerticalDroite.rotate( Math.PI / 9);

        return barVerticalDroite.add(barVerticalGauche);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle barVerticalGauche = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalGauche.translate(new Point2d(-(largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        Rectangle barVerticalDroite = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalDroite.translate(new Point2d((largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        Rectangle barOblique = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barOblique.rotate(-Math.PI / 12);
        barVerticalDroite.add(barOblique);

        return barVerticalDroite.add(barVerticalGauche);
    }

    /** TODO
     * Create the letter M graphically
     * @return BaseShape containing the letter M
     */
    public static BaseShape create_M() {
        Rectangle barVerticalGauche = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalGauche.translate(new Point2d(-(largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        Rectangle barVerticalDroite = new Rectangle(largeurBarVertical, hauteurBarVertical);
        barVerticalDroite.translate(new Point2d((largeurBarHorizontal/2 - largeurBarVertical/2), 0.));
        barVerticalDroite.add(barVerticalGauche);
        Rectangle barObliqueGauche = new Rectangle(largeurBarOblique/4, hauteurBarOblique);
        barObliqueGauche.rotate(-Math.PI / 20);
        Rectangle barObliqueDroite = new Rectangle(largeurBarOblique/4, hauteurBarOblique);
        barObliqueDroite.rotate(Math.PI / 20);
        barObliqueGauche.translate(new Point2d(-10., 0.));
        barObliqueDroite.translate(new Point2d(10., 0.));
        barObliqueGauche.add(barObliqueDroite);

        Rectangle miniBarVertical = new Rectangle(largeurBarHorizontal, (hauteurBarHorizontal*2)/3);
        miniBarVertical.translate(new Point2d(  (hauteurBarVertical/2.5 - hauteurBarHorizontal), 0.0 ));
        miniBarVertical.rotate(Math.PI/2);
        //barObliqueGauche.remove(miniBarVertical);
        //barObliqueGauche.remove(miniBarVertical);
        barVerticalDroite.add(barObliqueGauche);
        //barVerticalDroite.add(miniBarVertical);
        //return barVerticalDroite.add(barVerticalGauche);
        return barVerticalDroite;
    }

}
