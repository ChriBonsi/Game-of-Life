package it.unicam.cs.pa.jgof.api;

import java.util.List;
import java.util.Optional;

public class SurvivalRule implements Rule<ConwayState> {
    @Override
    public Optional<ConwayState> apply(ConwayState cellStatus, List<ConwayState> neighboursStatus) {
        if (cellStatus == ConwayState.ALIVE) {
            long counter = neighboursStatus.stream().filter(ConwayState::isAlive).count();
            if (counter == 2 || counter == 3) {
                return Optional.of(ConwayState.ALIVE);
            }
        }
        return Optional.empty();
    }
}
