package WarGames.Interfaces;

/**
 *  String checkGrade() which returns the associated float value in grade objects
 * precondition: assignment has grade
 * post condition: returns the grade value (string) taken from the assignment
 * @returns String grade
 */

public interface PeopleInterface {

     String checkGrade(String studentName,String professor, String course1);
}
