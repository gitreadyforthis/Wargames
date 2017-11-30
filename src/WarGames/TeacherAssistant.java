package WarGames;

public class TeacherAssistant implements People, Grader {
    Course[] courseload;

    public TeacherAssistant(Course[] courseload) {
        this.courseload = courseload;
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
}
