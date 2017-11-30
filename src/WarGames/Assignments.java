package WarGames;

public class Assignments implements Assignment {
    Student student;
    private int grade;

    public Assignments(int grade) {
        this.grade = grade;
        student = new Student();
    }

    /**
     * @return
     */
    private int getGrade(int grade) {
        return grade;
    }

    /**
     * @return
     */
    private boolean hasGrade() {
        return false;
    }

    @Override
    public boolean isPosted() {
        return false;
    }
}
