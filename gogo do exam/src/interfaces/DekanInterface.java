package interfaces;

import models.GroupModel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public interface DekanInterface {

    public void changeStudentStatus(StudentInterface stud, boolean stateToSet);
    public ArrayList <wrapOBJ> getStudentsAndGroupByCity( String city);
    public void moveStudentToGroup(GroupInterface destination, GroupInterface source, StudentInterface stud);
}
