package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SituationTest {

    @Test
    void shouldReturnEligiblePlayers() {
        Team team = new Team(
                new Player("Pumita", true),
                new Player("Pedro Rauim", false),
                new Player("Jair", true),
                new Player("Orellano", false)
        );

        assertEquals(2, Situation.countEligiblePlayers(team));
    }

    @Test
    void shouldReturnTotalPlayers() {
        Team team = new Team(
                new Player("Pumita", true),
                new Player("Pedro Rauim", false),
                new Player("Jair", true),
                new Player("Orellano", false)
        );

        assertEquals(4, Situation.countTotalPlayers(team));

    }
}
