package WarGames;

/**
 * The interface for People (Students, Professors, TA's)
 * a boolean checkRegistered() which checks if the people are registered for the course
 * precondition: a "person" tries to access the course
 * postCondition: the system returns true (the user is valid) if not the system returns an error (false)
 *
 * float checkGrade() which returns the associated float value in grade objects
 * precondition: assignment has grade
 * post condition: returns the grade value (float) taken from the assignment
 */

public interface People {
    boolean checkRegistered(String myCourse, String myStudent, String myProfessor, String myTA);

    float checkGrade();
}
