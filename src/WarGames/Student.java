package WarGames;

public class Student implements People {
    Course[][] courseload;

    public void uploadAssignment() {

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
