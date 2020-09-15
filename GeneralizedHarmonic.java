/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;


        for (int i = 1; i < n; i++) {
            int a = 1 + i;
            double power = Math.pow(a, r);
            // System.out.println(power);
            double b = 1.0 / power;
            sum += b;
            // System.out.println(b);
            // double h = 1 + b;
            // System.out.println(h);
        }
        sum += 1;
        System.out.println(sum);

    }
}
