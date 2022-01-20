package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public interface SecretaryInterface {

    public void createGroup( String groupName, ArrayList<StudentInterface> students, String course);
    public void deleteGroup(String groupName);
    public ArrayList<StudentInterface> getAllStudentsOfGroup(String groupName);
    public ArrayList<StudentInterface> getAllStudentsOfCourse(String course);
    public void addStudentToGroup(StudentInterface stud, String groupName);
}
