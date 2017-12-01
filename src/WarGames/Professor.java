package WarGames;

/**
 *this is the public class for Professor
 *it implements both grader and people interfaces
 * this class contains an Course array of course objects called courseLoad
 * an Assignment array of assignment objects called assignments
 * and a Grade array of grades called grades
 */

public class Professor implements People, Grader {
    Course[] courseload;
    Assignments[] assignments;
    Grade[] grades;

    /**
     * postAssignment() creates an assignment object
     * and "posts" it to the relevant course
     * precondition: assignment does not already exist
     * postcondition: assignment object is created and set to visible in the course
     *
     */
    public void postAssignment() {


    }

    /**
     * removeAssignment() removes an already existing assignment object
     * from the relevant course and "sets" the visibility to false
     * as long as there is no grade associated with the assignment
     * precondition: an assignment without a grade exists
     * postCondition: the assignment is removed from the array and visibility is set to false
     */
    public void removeAssignment() {

    }

    /**
     * createGrade() creates a grade object
     * precondition: a grade object does not exist
     * postcondition: a grade object is created
     */

    @Override
    public void createGrade() {

    }

    /**
     * changeGrade() modifies the attributes of a preexisting grade object
     * preCondition: a grade already exists
     * post condition: the grades values are modified
     */
    @Override
    public void changeGrade() {

    }

    /**
     * boolean pollStudents() checks if the student object exists/ is valid for the particular
     * assignment/ grade
     * precondition student tries to access grade
     * post condition: returns data if true, returns error false
     */
    @Override
    public boolean pollStudents() {
        return false;
    }

    /**
     * @param array of Courses
     * @return new Course object at designated spot in array
     */
   @Override
    public Course[] courseAccess() {
        return new Course[0];
    }

    /** checkRegistered() which checks if the people are registered for the course
     * precondition: a "person" tries to access the course
     * postCondition: the system returns true (the user is valid) if not the system returns an error (false)
     **/
    @Override
    public boolean checkRegistered() {
        return false;
    }


   /** checkGrade() which returns the associated float value in grade objects
     * precondition: assignment has grade
     * post condition: returns the grade value (float) taken from the assignment
     * @return float
    **/
    @Override
    public float checkGrade() {
        return 0;
    }
}
