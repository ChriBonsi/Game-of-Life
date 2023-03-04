package it.unicam.cs.pa.jgof.api;

import java.util.List;

/**
 * Representation of how the space is managed in the game.
 * @param <C> the type of the coordinates
 */
public interface Space<C> {

    List<C> neighbours(C c);

}
