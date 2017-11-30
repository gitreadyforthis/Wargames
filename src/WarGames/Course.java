package WarGames;

public class Course implements Courses {
    char grade;
    People[] people;

    private boolean isRegistered() {
        return true;
    }

    private char finalGrade() {
        return 0;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public boolean hasAssignment() {
        return false;
    }
}
