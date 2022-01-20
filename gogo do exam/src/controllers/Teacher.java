package controllers;

import interfaces.wrapOBJ;
import interfaces.GroupInterface;
import interfaces.StudentInterface;
import interfaces.TeacherInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Teacher implements TeacherInterface {

    private LinkedList<GroupInterface> GroupList;
    private ArrayList<StudentInterface> AllStudents;
    Teacher(LinkedList<GroupInterface> GroupsList, ArrayList<StudentInterface> StudentList ){
        this.GroupList=GroupsList;
        this.AllStudents=StudentList;
    };


    public ArrayList<StudentInterface> getAllStudentsOfGroup(String groupName) {
      for (var group : GroupList){
          if (group.getGroupName().equals(groupName)){
              return group.getAllStudents();
          }
      }

        return null;
    }

    public ArrayList <wrapOBJ> getStudentsAndGroupByName2(String name2) {
        ArrayList <wrapOBJ> result=new ArrayList<>();
        wrapOBJ wrap=new wrapOBJ();
        AllStudents.forEach(e->{
            if(e.getSrcondName().equals(name2)){
                wrap.put(null, e);
                result.add(wrap);
                if (e.getStydyState()){
                    result.remove(wrap);
                    GroupList.forEach(group->
                            group.getAllStudents().forEach(student->{
                                if (e ==student){
                                    wrap.put(group.getGroupName(), e);
                                    result.add(wrap);
                                }
                            }));
                }

            }
        });
        return  result;
    }



}
