package WarGames;

/**
 * this is the interface for the Grade objects
 * it contains a boolean gradeExist() which checks is there is a grade
 * precondition: the system checks if there is a grade associated with an assignment
 * postcondition: returns true if grade exists, returns false if not.
 */

public interface Grade {
    boolean gradeExist();
}
