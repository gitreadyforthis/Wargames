package WarGames;

/**
 * The class for Assignments
 * has a grade value (int) and values for students
 */

public class Assignments implements Assignment {
    Student student;
    private int grade;

    public Assignments(int grade) {
        this.grade = grade;
        student = new Student();
    }

    /**
     * getGrade() returns a grade value associated
     * with the assignment object
     */
    private int getGrade(int grade) {
        return grade;
    }

    /**
     * hasGrade() checks to see if the assignment has a
     * grade associated with it or not
     * returns false until assignment has grade added
     */
    private boolean hasGrade() {
        return false;
    }

    /**
     * boolean isPosted()
     * checks if the assignment is posted
     */

    @Override
    public boolean isPosted() {
        return false;
    }
}
