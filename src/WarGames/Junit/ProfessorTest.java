package WarGames.Junit;

import WarGames.Classes.Professor;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ProfessorTest {
    private Professor professor = new Professor();


    @Test
    void removeAssignment() throws IOException {
        professor.removeAssignment();
    }


    @Test
    void changeGrade() {
        professor.changeGrade();
    }



    @Test
    void checkGrade() {
        professor.checkGrade("", "", "");
    }
}