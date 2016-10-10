/**
 * Author: Vien Van
 * Description: Trying Math functions in Java
 * Name: Exercise 3.1
 * Date: 10/09/2016
 */
public class MyMath {
    public static double roundToHundredth(double number)
    {
        double roundedNumber = Math.round(number*100) / 100.;
        return roundedNumber;
    }
}
