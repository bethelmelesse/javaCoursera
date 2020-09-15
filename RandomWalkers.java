/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trails = Integer.parseInt(args[1]);

        int step = 0;
        // System.out.println("(" + x + "," + y + ")");

        for (int i = 0; i < trails; i++) {
            int x = 0;
            int y = 0;
            int stop = Math.abs(x) + Math.abs(y);
            // System.out.println("" + x + y);
            while (stop != r) {
                double random = Math.random();
                if (random < 0.25) y += 1;
                else if (random < 0.5) x += 1;
                else if (random < 0.75) y -= 1;
                else x -= 1;
                stop = Math.abs(x) + Math.abs(y);
                // System.out.println("(" + x + "," + y + ")");
                step += 1;
            }
            // System.out.println("steps = " + step);
        }
        double average = (double) step / (double) trails;

        System.out.println("average number of steps = " + average);
    }
}
