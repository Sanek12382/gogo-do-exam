package controllers;

import interfaces.DekanInterface;
import interfaces.GroupInterface;
import interfaces.StudentInterface;
import interfaces.wrapOBJ;

import java.util.ArrayList;
import java.util.LinkedList;



public class Dekan implements DekanInterface {

    private LinkedList<GroupInterface> GroupList;
    private ArrayList<StudentInterface> AllStudents;
    Dekan(LinkedList<GroupInterface> GroupsList, ArrayList<StudentInterface> StudentList ){
        this.GroupList=GroupsList;
        this.AllStudents=StudentList;
    };
    public void changeStudentStatus(StudentInterface stud,boolean stateToSet) {

        AllStudents.forEach(e->{
            if (e.equals(stud)){
                e.setStudyState(stateToSet);
            }
        });
    }


    public ArrayList <wrapOBJ> getStudentsAndGroupByCity( String city) {

        ArrayList <wrapOBJ> result=new ArrayList<>();
        wrapOBJ wrap=new wrapOBJ();

       AllStudents.forEach(e->{
           if(e.getPlaceOfLiving().equals(city)){
               StudentInterface temp=e;
               wrap.put(null,temp);
               result.add(wrap);
               if (temp.getStydyState()){
                   result.remove(wrap);
                   GroupList.forEach(group->
                           group.getAllStudents().forEach(student->{
                               if (temp==student){
                                  wrap.put(group.getGroupName(),temp);
                                   result.add(wrap);
                               }
                           }));
               }

           }
       });
       return  result;
    }


    public void moveStudentToGroup(GroupInterface destination, GroupInterface source, StudentInterface stud) {
    GroupList.forEach(e->{
        if (e.equals(source)){
            e.removeStudent(stud);
        }
        if (e.equals(destination)){
            e.addStudent(stud);
        }
    });
    }
}
