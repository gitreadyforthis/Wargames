package WarGames;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student  student = new Student();
    File file1 = new File("src/WarGames/Assignments.txt");
    Scanner scan = null;

    @org.junit.jupiter.api.Test
    void uploadAssignment() throws IOException {
        student.uploadAssignment("Jake", "Nystrom", "Data Structures", "Nystrom", "assignment1.txt");
    }
}


