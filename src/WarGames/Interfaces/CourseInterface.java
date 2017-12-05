package WarGames.Interfaces;

/**
 * this is the interface for CourseInterface
 * the boolean isVisible(): precondition the professor has posted an assignment to course
 * postcondition: returns true or false (visible or invisible)
 * boolean hasAssignment(): precondition, checks if assignment objects exist in assignment
 * postCondition: returns true if exist returns false if not
 */

public interface CourseInterface {
    boolean isVisible(String myCourse, String assignmentNo);

    boolean hasAssignment(String myCourse);

    String getGrade(String myCourse, String myStudent, String myProfessor);
}