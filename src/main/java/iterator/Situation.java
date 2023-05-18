package iterator;

import java.util.Iterator;

public class Situation {

    public static Integer countEligiblePlayers(Team team) {
        int eligiblePlayer = 0;
        for(Player player : team) {
            if (player.isEligible()) {
                eligiblePlayer++;
            }
        }
        return eligiblePlayer;
    }

    public static Integer countTotalPlayers(Team team) {
        int totalPlayers = 0;
        for (Iterator a = team.iterator(); a.hasNext();) {
            totalPlayers++;
            a.next();
        }
        return totalPlayers;
    }
}
