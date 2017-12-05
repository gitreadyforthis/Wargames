package WarGames.Junit;

import WarGames.Classes.TeacherAssistant;
import org.junit.jupiter.api.Test;

class TeacherAssistantTest {
    private TeacherAssistant tA = new TeacherAssistant();
    @Test
    void checkGrade() {
        tA.checkGrade("", "", "");
    }

    @Test
    void changeGrade() {
        tA.changeGrade();
    }

}