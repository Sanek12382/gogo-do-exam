package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;

public interface CouerseInterface {

    public LinkedList<GroupInterface> getGroupList();
    public void addGroup(GroupInterface group);
    public void addGroup(String groupName, ArrayList<StudentInterface> students);

    public void removeGroup(GroupInterface group);
    public  String getCourseName();
    public ArrayList<StudentInterface> getAllStudetList();
    public void addStudent(StudentInterface student);
    public void addStudent(String studentFirstName, String  studentSecondName,String placeOfLiving);


}
