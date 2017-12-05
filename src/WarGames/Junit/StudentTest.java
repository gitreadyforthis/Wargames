package WarGames.Junit;

import WarGames.Classes.Student;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

class StudentTest {
    private Student student = new Student();

    Scanner scan = null;

    @org.junit.jupiter.api.Test
    void uploadAssignment() throws IOException {
        student.uploadAssignment("Jake", "Nystrom", "Data Structures", "1", "assignment1.txt");

    }

    @Test
    void checkGrade()
    {
        student.checkGrade("Jake","Nystrom", "Data Structures");

    }
}


