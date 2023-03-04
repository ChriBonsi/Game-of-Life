package it.unicam.cs.pa.jgof.api;

import java.util.List;
import java.util.Optional;

/**
 * Representation of a rule.
 * @param <S> the type of the cell status
 */
@FunctionalInterface
public interface Rule<S> {

    /**
     * Applies the rule to the cell.
     * @param cellStatus the status of the target cell
     * @param neighboursStatus the status of the neighbours of the target cell
     * @return the status of the cell after the application of the rule, otherwise
     * TODO if the rule doesn't apply.
     */
    Optional<S> apply(S cellStatus, List<S> neighboursStatus);
}
