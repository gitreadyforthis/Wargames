package WarGames;

/**
 * The interface for People (Students, Professors, TA's
 * contains an array of Course objects called courseAccess
 * a boolean checkRegistered() which checks if the people are registered for the course
 * and float checkGrade() which returns the associated float value in grade objects
 */

public interface People {
    Course[] courseAccess();

    boolean checkRegistered();

    float checkGrade();
}
