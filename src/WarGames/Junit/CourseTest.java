package WarGames.Junit;

import WarGames.Classes.Course;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    private Course course = new Course();
    @org.junit.jupiter.api.Test
    void isVisible() {
        String course1 = "Data Structures";
        String assign1 = "1";
        boolean result1 = course.isVisible(course1, assign1);

        assertFalse(result1);
        String course2 = "Software Engineering";
        String assign2 = "5";
        boolean result2 = course.isVisible(course2, assign2);

        assertTrue(result2);
    }

    @org.junit.jupiter.api.Test
    void hasAssignment() {
        String cours = "Data Structures";
        boolean result = course.hasAssignment(cours);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void getGrade() {
        String course1 = "Data Structures";
        String student1 = "Jake";
        String professor1 = "Nystrom";
        String result = course.getGrade(course1, student1, professor1);
        String tester = "A";

        assertEquals(tester, result);

        String course2 = "Software Engineering";
        String student2 = "Greg";
        String professor2 = "Nystrom";
        String result2 = course.getGrade(course2, student2, professor2);
        String tester2 = "B";

        assertEquals(tester2, result2);

    }
}