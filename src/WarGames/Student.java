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
/**
 * the public class for Students
 * implements People Interface
 */
public class Student implements People {

    File file = new File("src/WarGames/Assignments.txt");
    File tester = new File("src/WarGames/files/Tester.txt");
    Scanner scan = null;
    char done = 'd';

    /**
     * uploads the students response to the listed assignment to the
     * assignment object
     * precondition: assignment object exists
     * post condition: student response is added to assignment object
     */
    public void uploadAssignment(String assignmentFile) throws FileNotFoundException, IOException {
        String search = "sub";




        try {
            FileReader fr = new FileReader(file);
            String newText = tester.toString();
            String stuff;
            String compleat = "";
            try (BufferedReader br = new BufferedReader(fr))
            {
                //scan = new Scanner(file);
                while ((stuff = br.readLine()) != null)
                {
                    compleat += stuff;
                }
                compleat = compleat.replaceAll(search,newText);
                FileWriter fw = new FileWriter(file);
                fw.write(compleat);
                fw.close();

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
       //while( scan.hasNextLine()) {
           // stuff = scan.nextLine();
         //   StringTokenizer myTokenizer = new StringTokenizer(stuff, ",");
           // String student = myTokenizer.nextToken();
           // String professor = myTokenizer.nextToken();
           // String courses = myTokenizer.nextToken();
           // String assignmentNo = myTokenizer.nextToken();
           // String submission = myTokenizer.nextToken();
           // String visibility = myTokenizer.nextToken();
            //if(submission.equals("sub"))
            //{
            //    newText = tester.toString();
            //    submission = submission.replace("sub",newText);

            //}
            //wr.write(submission);
        //}
        //wr.close();
        //scan.close();
        }

 /** boolean checkRegistered() which checks if the people are registered for the course
 * precondition: a "person" tries to access the course
 * postCondition: the system returns true (the user is valid) if not the system returns an error (false)
 **/
    @Override
    public boolean checkRegistered()
    {
        return false;
    }

    /**
     * checkGrade() which returns the associated float value in grade objects
     * precondition: assignment has grade
     * post condition: returns the grade value (float) taken from the assignment
     * @return float
     */
    @Override
    public float checkGrade() {
        return 0;
    }
}
