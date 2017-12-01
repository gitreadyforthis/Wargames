package WarGames;

/**
 * the public class for Students
 * implements People Interface
 * contains an array of Course Objects called
 * courseload
 */
public class Student implements People {
    Course[] courseload;

    /**
     * uploads the students response to the listed assignment to the
     * assignment object
     * precondition: assignment object exists
     * post condition: student response is added to assignment object
     */
    public void uploadAssignment() {

    //Assignments added = new Assignments();
    }

    /**
     * @param array of Courses
     * @return new Course object at designated spot in array
     */
    @Override
    public Course[] courseAccess() {
        return new Course[0];
    }


 /** boolean checkRegistered() which checks if the people are registered for the course
 * precondition: a "person" tries to access the course
 * postCondition: the system returns true (the user is valid) if not the system returns an error (false)
 **/
    @Override
    public boolean checkRegistered() {
        return false;
    }

    /**
     * checkGrade() which returns the associated float value in grade objects
     * precondition: assignment has grade
     * post condition: returns the grade value (float) taken from the assignment
     * @return float
     */
    @Override
    public float checkGrade() {
        return 0;
    }
}
