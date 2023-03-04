package it.unicam.cs.pa.jgof.api;

/**
 * The statuses in which a cell can be found in the regular version of the game.
 */
public enum ConwayState {
    DEAD, ALIVE;

    public boolean isAlive() {
        return this == ALIVE;
    }

    public boolean isDead() {
        return this == DEAD;
    }
}
