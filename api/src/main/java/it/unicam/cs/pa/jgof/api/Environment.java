package it.unicam.cs.pa.jgof.api;

/**
 * The generic representation of the environment in which the game is taking place.
 * @param <C> the type for the cell location
 * @param <S> the type of the cell status
 */
public interface Environment<C,S> {

    /**
     * Returns the status of the cell at the specified location.
     * @param loc the location of the cell
     * @return the status of the cell at the specified location.
     */
    S statusAt(C loc);

    //TODO
    /**
     *
     */
    void evolve();
}
