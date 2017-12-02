package WarGames;

public class TeacherAssistant implements People, Grader {
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
}
