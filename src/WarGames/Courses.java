package WarGames;

/**
 * this is the interface for Courses
 * the boolean isVisible(): precondition the professor has posted an assignment to course
 * postcondition: returns true or false (visible or invisible)
 * boolean hasAssignment(): precondition, checks if assignment objects exist in assignment
 * postCondition: returns true if exist returns false if not
 */

public interface Courses {
    boolean isVisible();

    boolean hasAssignment();
}
