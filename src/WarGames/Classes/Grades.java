package WarGames.Classes;

import WarGames.Interfaces.GradeInterface;

/**
 * the public class for Grades
 * implements the grade interface
 * contains one float value grade
 *
 * DUE TO TIME CONSTRAINTS, THIS CLASS WAS NOT IMPLEMENTED. DOCUMENTATION FOR THE CLASS IS
 * IMPLEMENTED REGARDLESS.
 *
 */
public class Grades implements GradeInterface {
    float grade;

    /**
     * getVal() gets the grade value from assignments
     * precondition: a grade value is associated with an assignment
     * postcondition: the value associated with the assignment is returned as a float
     * @retuns float grade
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
