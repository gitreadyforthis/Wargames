package WarGames;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;
        import java.util.StringTokenizer;

/**
 * The class for course, contains a single character called grade
 * and a People array of people objects
 * contains a scanner to read in user input
 * and a file io to read in files
 */
public class Course implements Courses {
    char grade;
//    Scanner scan = new Scanner("studentrecords/grades.txt").useDelimiter("\\s*Final Grade:\\s*");
//    String stuff = scan.nextLine();


    File file = new File("src/WarGames/grades.txt");
    Scanner scan = null;
    /**
     * boolean isRegistered() checks if the user(professor,ta,or student)
     * is actually registered for the course they want to access
     * returns true until checked
     */
    private boolean isRegistered() {
        return true;
    }

    /**
     * char finalGrade() is the final letter grade for the course
     * for now it returns 0 until it takes in the grade data from the
     * whole of the assignments in the course
     */

    private char finalGrade() {
        return 0;
    }

    /**
     * isVisible() checks to see if the assignment is listed as
     * visible by the professor
     * precondition the professor has posted an assignment to course
     * postcondition: returns true or false (visible or invisible)
     */
    @Override
    public boolean isVisible() {
        return false;
    }

    /**
     * hasAssignment() checks if the course has any assignment Objects associated
     * with it.
     * precondition, checks if assignment objects exist in assignment
     * postCondition: returns true if exist returns false if not
     */
    @Override
    public boolean hasAssignment() {
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //if ()
        //{

        //}
        //else
       //     {

        //}
        scan.close();
        return false;

    }
    public String getGrade(){

        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String stuff;
        String compleat=null;

        assert scan != null;
        while( scan.hasNextLine()) {
            stuff = scan.nextLine();
            StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
            String student = myTokenizer.nextToken();
            String grade = myTokenizer.nextToken();
            if (student.equals("Greg"))
                compleat = grade;
        }
        scan.close();
        return compleat;
    }
}
