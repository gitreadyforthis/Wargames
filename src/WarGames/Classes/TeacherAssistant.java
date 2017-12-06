package WarGames.Classes;

import WarGames.Interfaces.GraderInterface;
import WarGames.Interfaces.PeopleInterface;

public class TeacherAssistant implements PeopleInterface, GraderInterface {

    /**
     * checkGrade() which returns the associated float value in grade objects
     * precondition: assignment has grade
     * post condition: returns the grade value (float) taken from the assignment
     * @return float
     */
    @Override
    public String checkGrade(String studentName,String professor, String course1)
    {
    return null;
    }

    /**
     * changeGrade() which changes the associated grade value
     * * precondition: assignment has grade
     * post condition: changes grade value
     * does not @return anything since its void
     */
    @Override
    public void changeGrade(String studentName, String professor, String course1, String newGrade) {

    }
}
