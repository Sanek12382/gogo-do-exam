package interfaces;

import java.util.ArrayList;

public interface GroupInterface {
    public String getGroupName();
    public ArrayList<StudentInterface> getAllStudents();
    public void addStudent(StudentInterface student);

    public void removeStudent(StudentInterface student);
    public String getCourse();
}
