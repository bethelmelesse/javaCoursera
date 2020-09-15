/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);


        String star = "* ";
        String zero = "0 ";
        String space = " ";


        // for (int i = 0; i < n; i++) {
        //     if (i <= width) System.out.println(star);
        //     else System.out.println(zero);
        // }

        // for w = 0
        for (int i = 0; i < n; i++) {
            String zero1 = "";
            if (n - width - i - 1 > 0) zero1 = zero.repeat(n - width - i - 1);

            String zero2 = "";
            if (i - width > 0) zero2 = zero.repeat(i - width);

            String star1 = star.repeat(width + 1);
            System.out.println(zero2 + star1 + zero1);
        }
        System.out.println(" ");

    }


}



