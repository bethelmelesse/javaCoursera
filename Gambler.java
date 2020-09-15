/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trails = Integer.parseInt(args[2]);

        int wins = 0;
        for (int t = 0; t < trails; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                if (Math.random() < 0.5) cash++;
                else cash--;
                System.out.println(cash);
            }
            if (cash == goal) wins++;
        }
        System.out.println(wins + " wins of " + trails);
    }


}

