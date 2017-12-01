package WarGames;

/**
 * The class for course, contains a single character called grade
 * and a People array of people objects
 */
public class Course implements Courses {
    char grade;
    People[] people;

    /**
     * boolean isRegistered() checks if the user(professor,ta,or student)
     * is actually registered for the course they want to access
     * returns true until checked
     */
    private boolean isRegistered() {
        return true;
    }

    /**
     * char finalGrade() is the final letter grade for the course
     * for now it returns 0 until it takes in the grade data from the
     * whole of the assignments in the course
     */

    private char finalGrade() {
        return 0;
    }

    /**
     * isVisible() checks to see if the assignment is listed as
     * visible by the professor
     * precondition the professor has posted an assignment to course
     * postcondition: returns true or false (visible or invisible)
     */
    @Override
    public boolean isVisible() {
        return false;
    }

    /**
     * hasAssignment() checks if the course has any assignment Objects associated
     * with it.
     * precondition, checks if assignment objects exist in assignment
     * postCondition: returns true if exist returns false if not
     */
    @Override
    public boolean hasAssignment() {
        return false;
    }
}
