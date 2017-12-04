package WarGames;

/**
 * the public class for Grades
 * implements the grade interface
 * contains one float value grade
 */
public class Grades implements Grade {
    float grade;

    /**
     * getVal() gets the grade value from assignments
     * precondition: a grade value is associated with an assignment
     * postcondition: the value associated with the assignment is returned as a float
     */
    private float getVal() {







        return grade;
    }


    /**
     * boolean gradeExist() checks is there is a grade
     * precondition: the system checks if there is a grade associated with an assignment
     * postcondition: returns true if grade exists, returns false if not.
     */
    @Override
    public boolean gradeExist() {
        return false;
    }
}
