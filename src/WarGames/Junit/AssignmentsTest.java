package WarGames.Junit;

import WarGames.Classes.Assignments;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssignmentsTest {
    Assignments assignment = new Assignments();
    @Test
    void getGrade() {
        int grade = assignment.getGrade("Jake", "Nystrom", "Data Structures", "1");
        Assertions.assertEquals(89.5, grade);
    }
}