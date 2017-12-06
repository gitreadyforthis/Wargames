package WarGames.Junit;

import WarGames.Classes.Professor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ProfessorTest {
    private Professor professor = new Professor();


    @Test
    void removeAssignment() throws IOException {
        professor.removeAssignment();
    }


    @Test
    void changeGrade() throws IOException {
        professor.changeGrade("Jake", "Nystrom", "Data Structures", "90");
        Assertions.assertEquals("90", professor.checkGrade("Jake", "Nystrom", "Data Structures"));
    }



    @Test
    void checkGrade() {
        professor.checkGrade("Jake", "Nystrom", "Data Structures");
    }
}