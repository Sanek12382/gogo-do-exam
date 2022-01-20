package models;

import interfaces.CouerseInterface;
import interfaces.GroupInterface;
import interfaces.StudentInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Coursemodel implements CouerseInterface {

    private String courseName;
    private LinkedList<GroupInterface> GroupList;
    private ArrayList<StudentInterface> AllStudents;

    public Coursemodel(LinkedList<GroupInterface> GroupList ,String courseName){
        this.GroupList=GroupList;
        this.courseName=courseName;
    };


    public synchronized LinkedList<GroupInterface> getGroupList() {
        return GroupList;
    }


    public synchronized void  addGroup(GroupInterface group) {
     GroupList.add(group);
    }


    public synchronized void addGroup(String groupName, ArrayList<StudentInterface> students) {
     GroupModel temp=new GroupModel(students,groupName);
     GroupList.add(temp);
    }



    public synchronized void removeGroup(GroupInterface group) {
      GroupList.forEach(e->{
          if(e==group){
              GroupList.remove(e);
          }
      });
    }


    public synchronized String getCourseName() {
        return courseName;
    }


    public ArrayList<StudentInterface> getAllStudetList() {
        return AllStudents;
    }


    public void addStudent(StudentInterface student) {
      AllStudents.add(student);
    }


    public void addStudent(String studentFirstName, String studentSecondName, String placeOfLiving) {
      StudentModel temp=new StudentModel(studentFirstName,studentSecondName,placeOfLiving);
     addStudent(temp);
    }


}
