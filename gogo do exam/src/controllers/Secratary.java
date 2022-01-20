package controllers;

import interfaces.GroupInterface;
import interfaces.SecretaryInterface;
import interfaces.StudentInterface;

import models.GroupModel;

import java.util.ArrayList;
import java.util.LinkedList;

public class Secratary implements SecretaryInterface {
    private LinkedList<GroupInterface> GroupList;
    private ArrayList<StudentInterface> StudentList;
    Secratary(LinkedList<GroupInterface> GroupsList, ArrayList<StudentInterface> StudentList ){
       this.GroupList=GroupsList;
       this.StudentList=StudentList;
    };
    public void createGroup( String groupName, ArrayList<StudentInterface> students, String course) {
        GroupInterface temp=new GroupModel(students,groupName, course);
        GroupList.add(temp);
    }


    public void deleteGroup( String groupName) {
      GroupList.forEach(e->{
          if (e.getGroupName().equals(groupName)){
              GroupList.remove(e);
          }
      });

    }


    public ArrayList<StudentInterface> getAllStudentsOfGroup(String groupName) {
        ArrayList<StudentInterface> result=new ArrayList<>();
        GroupList.forEach(e->{
            if(e.getGroupName().equals(groupName)){
                result.addAll( e.getAllStudents());
            }
        });

        return result;
    }


    public ArrayList<StudentInterface> getAllStudentsOfCourse(String course) {
        ArrayList<StudentInterface> result=new ArrayList<>();
        GroupList.forEach(e->{
         if (e.getCourse().equals(course)){
             result.addAll(e.getAllStudents());
         }
        });

        return result;
    }


    public void addStudentToGroup(StudentInterface stud, String groupName) {
       GroupList.forEach(e->{
           if (e.getGroupName().equals(groupName)){
               e.addStudent(stud);
           }
       });
    }
}
