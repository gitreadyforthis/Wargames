package WarGames.Junit;

import WarGames.Classes.TeacherAssistant;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TeacherAssistantTest {
    private TeacherAssistant tA = new TeacherAssistant();
    @Test
    void checkGrade() {
        tA.checkGrade("Jake", "Nystrom", "Data Structures");
    }

    @Test
    void changeGrade() throws IOException {
        tA.changeGrade("Jake", "Nystrom", "Data Structures", "90");
    }

}