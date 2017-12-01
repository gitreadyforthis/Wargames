package WarGames;

/** this is the interface for Grader
 * it contains 2 void methods and one boolean
 * createGrade() creates a grade object
 * precondition: a grade object does not exist
 * postcondition: a grade object is created
 *
 * changeGrade() modifies the attributes of a preexisting grade object
 * preCondition: a grade already exists
 * post condition: the grades values are modified
 *
 * boolean pollStudents() checks if the student object exists/ is valid for the particular
 * assignment/ grade
 * precondition student tries to access grade
 * post condition: returns data if true, returns error false
 */

public interface Grader {
    void createGrade();

    void changeGrade();

    boolean pollStudents();
}
