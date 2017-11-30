package WarGames;

public class Professor implements People, Grader {
    Course[] courseload;
    Assignments[] assignments;
    Grade[] grades;

    /**
     *
     */
    public void postAssignment() {

    }

    public void removeAssignment() {

    }

    @Override
    public void createGrade() {

    }

    @Override
    public void changeGrade() {

    }

    @Override
    public boolean pollStudents() {
        return false;
    }

    @Override
    public Course[] courseAccess() {
        return new Course[0];
    }

    @Override
    public boolean checkRegistered() {
        return false;
    }

    @Override
    public float checkGrade() {
        return 0;
    }
}
