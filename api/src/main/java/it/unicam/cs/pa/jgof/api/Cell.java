package it.unicam.cs.pa.jgof.api;

/**
 * Interface that represents the concept of a cell.
 * @param <L> the type for the cell location
 * @param <S> the type for the cell status
 */
public interface Cell<L,S> {

    /**
     * Returns the location of the current Cell.
     * @return the location of the current Cell.
     */
    L getLocation();

    /**
     * Returns the status of the current Cell.
     * @return the status of the current Cell.
     */
    S getStatus();
}
