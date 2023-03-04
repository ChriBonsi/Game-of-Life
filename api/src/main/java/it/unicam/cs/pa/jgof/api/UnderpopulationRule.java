package it.unicam.cs.pa.jgof.api;

import java.util.List;
import java.util.Optional;

public class UnderpopulationRule implements Rule<ConwayState> {
    @Override
    public Optional<ConwayState> apply(ConwayState cellStatus, List<ConwayState> neighboursStatus) {
        if (cellStatus == ConwayState.ALIVE) {
            if (neighboursStatus.stream().filter(ConwayState::isAlive).count() < 2) {
                return Optional.of(ConwayState.DEAD);
            }
        }
        return Optional.empty();
    }
}
