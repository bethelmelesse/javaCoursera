/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
        double r = 6371.0;

        double product = 2 * r;
        double theta1 = (x2 - x1) / 2;
        double theta2 = (y2 - y1) / 2;
        double a1 = Math.sin(theta1);
        double a = a1 * a1;

        double b1 = Math.sin(theta2);
        double b2 = b1 * b1;
        double b = Math.cos(x1) * Math.cos(x2) * b2;

        double sum = a + b;
        double root = Math.sqrt(sum);
        double w = Math.asin(root);
        double distance = product * w;

        System.out.println(distance + " kilometers");

    }
}
