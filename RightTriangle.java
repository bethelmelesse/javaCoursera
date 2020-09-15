/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {

        // input the sides of the right triangle
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean positive;
        boolean sum;
        boolean check;
        positive = (a > 0) && (b > 0) && (c > 0);
        sum = (a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a);
        check = positive && sum;
        System.out.println(check);
    }
}
