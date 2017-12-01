package WarGames;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course = new Course();
    @org.junit.jupiter.api.Test
    void isVisible() {
    }

    @org.junit.jupiter.api.Test
    void hasAssignment() {
    }

    @org.junit.jupiter.api.Test
    void getGrade() {
        String arf = course.getGrade();
        String goog = "B";
        assertEquals(goog, arf);
    }
}