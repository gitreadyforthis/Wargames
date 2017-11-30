package WarGames;

public class Grades implements Grade {
    float grade;

    private float getVal() {
        return grade;
    }

    @Override
    public boolean gradeExist() {
        return false;
    }
}
