package WarGames.Junit;

import WarGames.Classes.Assignments;
import WarGames.Classes.Student;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class StudentTest {
    private Student student = new Student();
    Assignments assignments;
    Scanner scan = null;

    @org.junit.jupiter.api.Test
    void uploadAssignment() {
        student.uploadAssignment("Jake", "Nystrom", "Data Structures", "1", "assignment1.txt");

    }

    @Test
    void checkGrade()
    {
        student.checkGrade("Jake","Nystrom", "Data Structures");

    }
}


